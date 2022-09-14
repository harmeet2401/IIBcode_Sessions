package main.functionalinterface;

import main.bean.Student;
import main.service.StudentsService;

import java.net.Inet4Address;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamapiexample {

    static public Predicate<Student> predicate = (student)-> student.getBooks()>=30;
    static public Predicate<Student> predicate1 = (student) -> student.getStreamname().contains("CSE");
    public static void main(String[] args) {

        Map<Integer,String> mapstudent = StudentsService.getStudents().stream()
                .collect(Collectors.toMap(Student::getId, Student::getName));
        System.out.println("Students data : "+ mapstudent);

        //filter the students as per the condition
        Map<Integer,String> mapstudent1 = StudentsService.getStudents().stream()
                .filter(predicate.or(predicate1))
                .collect(Collectors.toMap(Student::getBooks, Student::getName));
        System.out.println("Filtered students :  " + mapstudent1);

        System.out.println("testing pek method---------------");
        StudentsService.getStudents().stream()
                .peek((student)->System.out.println("Pre filter  : "+ student)) /// this show internal iteration of each student object is happening.
                .filter(predicate1)
                .peek((student)->System.out.println("Post filter :  "+ student)) /// this show internal iteration of each student object is happening.
                .collect(Collectors.toList());

        // map method is just to convert from one type to another.
        List<Integer> namelist =  StudentsService.getStudents().stream()
                .map(Student::getId)
                //.peek(System.out::println)
                .map((id)->++id)
                .collect(Collectors.toList());

        Set<String> nameSet =  StudentsService.getStudents().stream()
                .map(Student::getName)
                //.peek(System.out::println)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());


        System.out.println("-----------------------------------------------------");
        System.out.println(namelist);
        System.out.println(nameSet);
        System.out.println("-----------------------------------------------------");
        System.out.println("Sorted by name list :  "+ StudentsService.getStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList()));

        System.out.println("Reversed order Sorted by name list :  "+ StudentsService.getStudents().stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList()));

        List<Integer> list  = new ArrayList<>();
        for(int i =0;i<9;i++) {
            list.add(i);
        }

        System.out.println("-----------------------------------------------------");
        BiFunction<Integer,Integer,Integer> fnmax = (a,b)->{
          return Integer.max(a,b);
        };
        System.out.println("Old list : " + list);
        Optional<Integer> r = list.stream()
                .min(Comparator.naturalOrder());
        System.out.println(r.get());
        System.out.println(fnmax.apply(2,5));


        System.out.println("#########################################################");
        // To get total number of books for CSE stream students
        Function<Student,Integer> functionList = (student)->{
            return student.getBooks();
        };
        Optional<Integer> totalbooks= StudentsService.getStudents().stream() //Stream<Student>
                .filter(student -> student.getStreamname().contains("CSE")) //Stream<Student>
                .map(Student::getBooks)//Stream<Integer>
                //.reduce(0,(b1,b2)->b1+b2)
                        .reduce(Integer::sum);


        System.out.println("Total number of books : "+totalbooks.get());

        // To get the student which have max books.
        Optional<Student> optionalStudent = StudentsService.getStudents().stream()
                //.map(s->s.getBooks())
                .reduce((s1,s2) -> s1.getBooks() > s2.getBooks() ? s1 : s2);
            if(optionalStudent.isPresent()){
                System.out.println("Student with max books : "+ optionalStudent.get() +
                        "\nMax Books count : "+ optionalStudent.get().getBooks());
            }

           // To get the max books count
        Optional<Integer> opmaxbooks = StudentsService.getStudents().stream()
                .map(student -> student.getBooks())
                .reduce(Integer::max);
        if(opmaxbooks.isPresent()){
            System.out.println("Max books : "+ opmaxbooks.get());
        }

        // to get the min books assigned
        Optional<Integer> opminbooks = StudentsService.getStudents().stream()
                .map(student -> student.getBooks())
                .reduce(Integer::min);
        if(opminbooks.isPresent()){
            System.out.println("Min books : "+ opminbooks.get());
        }

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int n = list1.size();
        int sum =  list1.stream()
                .limit(9)
                .skip(3)
                .reduce(0,(a,b)->a+b);

        System.out.println("Sum : - "+sum +" Average : - "+ sum/n);

        //anymatch , allmatch , nonmatch
        System.out.println(StudentsService.getStudents().stream()
                .allMatch(students -> students.getBooks()>10));
        System.out.println(StudentsService.getStudents().stream()
                .noneMatch(students -> students.getBooks()>10));
        System.out.println(StudentsService.getStudents().stream()
                .anyMatch(students -> students.getBooks()>10));

        //finfirst , findany
        System.out.println(StudentsService.getStudents()
                .stream()
                .findAny());
        System.out.println(StudentsService.getStudents()
                .stream()
                .findFirst());
        // factory methods of stream api : of() , generate() , iterate()
        IntStream stream = IntStream.of(12,3,4,5,6,77,8);
        System.out.println("Average of intstream   : "+ stream.average().getAsDouble());
        /*System.out.println("sun of intstream   : "+ stream.sum());
        System.out.println("max of intstream   : "+ stream.max());
        System.out.println("min of intstream   : "+ stream.min());
*/
        Stream<String> stringStream = Stream.of("name","address","id");

        /*Stream.iterate(1, x -> x * 2);*/

        Stream.generate(Student::new);
       /* Stream.generate(Arrays::asList)
                .forEach(l->{
                    System.out.println(l);
                });*/
        /*Stream.generate(new Random()::nextInt)
                .forEach(System.out::println);*/

        Optional<Student> optionalStudents = Optional.ofNullable(StudentsService.supplier.get());
        System.out.println("Checkk ---  "
                + optionalStudents.map(Student::getName).orElseGet(StudentsService.suppliername));
    }
}
