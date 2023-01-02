package org.example;

import org.example.bean.Student;
import org.example.bean.StudentInstanceClass;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class AllStreamApiAndLambdaPracticeQuickClass {
    static Consumer<String> consumer = (name)->{
        System.out.println(name.toUpperCase());
    };

    public static void main(String[] args) {
        //consumer.accept("Harmeet singh");

        List<Student> list = StudentInstanceClass.getStudents();
        //getName(list);
        //getNameAndActivities(list);
        //getNameAndNumberOfActivities(list);
        //getNameAndStudentObject(list);
        //getListOfActivitesAndItsCountGreaterThan2(list);
        //getTotalNumberOfUniqueActivities(list);
        //getStudentWithGrade2orhigherfromIT(list);
        //getStudentsInaSet(list);

        //getStudentsInaSet(list);
        sortedByName(list);


    }
    public static void getName(List<Student> list){
        list.forEach((s)->{
            System.out.println(s);
        });
    }

    public static void getNameAndActivities(List<Student> list){
        list.forEach((s)->{
            System.out.println(s.getName()+" - "+s.getActivities());
        });
    }

    static Function<Student,List<String>> function = Student::getActivities;
    static Function<Student,Integer> function_no_activities = (s)->{
        return s.getActivities().size();
    };

    static Function<Student,Student> function_student = (s)->{return s;};
    public static void getNameAndNumberOfActivities(List<Student> list){
        System.out.println(list.stream()
                .collect(toMap(Student::getName,function_no_activities)));
    }
    static Predicate<Student> predicate = (s)->{return s.getActivities().size()>1;};
    public static void getNameAndStudentObject(List<Student> list){
        /*System.out.println(list.stream()
                .collect(Collectors.toMap(Student::getName,function_student)));*/
        list.stream()
                .filter(predicate)
                .peek(System.out::println)
                .collect(toMap(Student::getName,function_student));
    }

    // streams

   /* Function<Stream<List<String>>,Integer> function_count_list  =(l)->
    {
        return
    }*/


    public static void getListOfActivitesAndItsCountGreaterThan2(List<Student> list){
        System.out.println(list.stream()
                .filter(predicate)//Streams<Student>
                .collect(toMap(Student::getActivities,function_no_activities)));
    }
    public static void getTotalNumberOfUniqueActivities(List<Student> list){
        System.out.println("Total Number of Activities unique : " + list.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .map(String::toLowerCase)//Stream<String>
                .sorted()
                .collect(toList()));

        System.out.println("Set of the names in lower case " + list.stream()
                .map(Student::getName)
                .map(String::toLowerCase)
                .collect(toSet()));


    }
    static Predicate<Student> predicate1 = (s)->{
        return s.getGrade()>2;
    };
    static Predicate<Student> predicate2 = (s)->{
        return s.getStream().equalsIgnoreCase("IT");
    };
    static Predicate<Student> predicate3 = (s)->{
        return s.getActivities().size()==3;
    };
    public static void getStudentWithGrade2orhigherfromIT(List<Student> list){
        System.out.println(list.stream()
                .filter(predicate1.or(predicate2).and(predicate3))
                .filter((s)->s.getName().startsWith("H"))
                .collect(toMap(Student::getName,Student::getActivities)));
        System.out.println(list.stream()
                .filter(predicate1.or(predicate2).and(predicate3))
                .filter((s)->s.getName().startsWith("H")));
    }

    static  Consumer<Student> hashcodeStudent = (s)->{
        System.out.println(s.hashCode());
    };
    public static void getStudentsInaSet(List<Student> list){
        System.out.println(Stream.of(6,6,6,1,2,3,4,5,8,7,7)
                        .sorted(Comparator.reverseOrder())
                        .collect(toList()));
        System.out.println(Stream.of(6,6,6,1,2,3,4,5,8,7,7)
                              .collect(toSet()));
        //set automatically sorts the sequence in natural orders.
        System.out.println(list.stream()
                        .peek(hashcodeStudent)
                         .collect(toSet()));
    }
    public static void sortedByName(List<Student> list){
        list.stream()
                .map(Student::getName)
                .sorted(Comparator.reverseOrder())
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
        System.out.println("--------Activities all unique to be sorted in natural order------------");
        list.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
        System.out.println("--------Sorting Students as per their names------------");
        list.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
        System.out.println("--------Sorting Students as per their grades as ascending orders------------");
        list.stream()
                .sorted(Comparator.comparing(Student::getGrade))
                .forEach(System.out::println);
        System.out.println("--------Sorting Students as per their books------------");
        list.stream()
                .sorted(Comparator.comparing(Student::getNoofbooks))
                .forEach(System.out::println);
        System.out.println("--------Sorting Students as per their grades as descending orders------------");
        list.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .forEach(System.out::println);
        int totalnumberofbokks = list.stream()
                .filter(student -> student.getGrade()>=10)
                .map(Student::getNoofbooks)
                .reduce(0,(a,b)->a+b);
        OptionalInt minbooks = list.stream()
                .mapToInt(Student::getNoofbooks)
                .min();
        int min = minbooks.getAsInt();
        System.out.println("Total number of books : "+totalnumberofbokks +" and min books is "+ min);

        System.out.println(Stream.of(1,2,3,4,5,6,6,7,7)
                .reduce(1,(n,m)->n*m));

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(integerList.stream()
                .mapToInt(Integer::intValue)
                .sum());
        System.out.println("max : " + integerList.stream()
                .mapToInt(Integer::intValue)
                .max().getAsInt());
        System.out.println("max using reduce : " + integerList.stream()
                .reduce(0,(n,m)->n> m ? n : m));
        List<Integer> emptyList = new ArrayList<>();
        Optional<Integer> optionalInteger = emptyList.stream()
                .reduce((a,b)-> a>b ? a: b);
        if (optionalInteger.isPresent()){
            System.out.println("Max values : "+ optionalInteger.get());
        }else{
            System.out.println("List is empty");
        }

        boolean g = list.stream()
                .allMatch(student -> student.getName().contains("H"));
        boolean g1 = list.stream()
                .anyMatch(student -> student.getName().contains("H"));
        boolean g2 = list.stream()
                .noneMatch(student -> student.getName().contains("H"));
        System.out.println(g +" " + g1 +" "+ g2 );

        System.out.println("First match for a predicate : " + list.stream()
                .filter(student -> student.getName().contains("H"))
                .findFirst());
        System.out.println("First any for a predicate : " + list.stream()
                .filter(student -> student.getName().contains("H"))
                .findAny());

        System.out.println("Joining functions : " +list.stream()
                .map(student -> student.getName())
                        .map(String::toLowerCase)
                .collect(joining()));

        System.out.println("Joining functions with delimiter  : " +list.stream()
                .map(student -> student.getName())
                .map(String::toLowerCase)
                .collect(joining("-")));
        System.out.println("Joining functions with delimiter , prefix and a suffix   : " +list.stream()
                .map(student -> student.getName())
                .map(String::toLowerCase)
                .collect(joining("-","[","]")));
        System.out.println(" functions counting  : " +list.stream()
                        .filter(student -> student.getGrade()>10)
                .count());
        System.out.println(" Collect functions counting  : " +list.stream()
                        .filter(student -> student.getGrade()>10)
                               .collect(counting()));
        System.out.println(" Collect Mapping functions counting club of below 228 and 229 LOC  : " +list.stream()
                .filter(student -> student.getGrade()>10)
                .collect(mapping(Student::getName, toList())));

        System.out.println(" Collect Mapping functions counting same to above but more LOC  : " +list.stream()
                .filter(student -> student.getGrade()>10)
                .map(Student::getName)
                .collect(toList()));

        System.out.println(" Collect Mapping functions counting club of below 237 and 238 LOC  : " +list.stream()
                .filter(student -> student.getGrade()>10)
                .collect(mapping(Student::getName, toSet())));

        System.out.println(" Collect Mapping functions counting same to above but more LOC  : " +list.stream()
                .filter(student -> student.getGrade()>10)
                .map(Student::getName)
                .collect(toSet()));

        System.out.println(" Collect Mapping functions counting club of below 246 and 247 LOC  : " +list.stream()
                .filter(student -> student.getGrade()>10)
                .collect(mapping(student -> student, toMap(Student::getName,Student::getActivities))));

        System.out.println(" Collect Mapping functions counting same to above but more LOC  : " +list.stream()
                .filter(student -> student.getGrade()>10)
                .map(student -> student)
                .collect(toMap(Student::getName,Student::getActivities)));
        // note : in nutshell mapping function is equals to map + collect

        System.out.println("  min functions  : " +list.stream()
                .min(Comparator.comparing(Student::getNoofbooks))
                .get());
        System.out.println("  max functions  : " +list.stream()
                .max(Comparator.comparing(Student::getNoofbooks))
                .get());
        System.out.println(" Collect minBy functions  : " +list.stream()
                .collect(minBy(Comparator.comparing(Student::getNoofbooks))).get());
        System.out.println(" Collect maxBy functions  : " +list.stream()
                .collect(maxBy(Comparator.comparing(Student::getNoofbooks))).get());

        System.out.println("Sum of number of books alloted : " + list.stream()
                .mapToInt(Student::getNoofbooks)
                .sum());
        System.out.println("max of number of books alloted : " + list.stream()
                .mapToInt(Student::getNoofbooks)
                .max().getAsInt());
        System.out.println("min of number of books alloted : " + list.stream()
                .mapToInt(Student::getNoofbooks)
                .min().getAsInt());
        System.out.println("average of number of books alloted : " + list.stream()
                .mapToInt(Student::getNoofbooks)
                .average().getAsDouble());
        System.out.println("Sum of notes books using Collector summarizingInt combine (mapToInt() + sum() + average + min  + max): "+ list.stream()
                .collect(summarizingInt(Student::getNoofbooks)));
        System.out.println("Sum of notes books using Collector summingInt combine (mapToInt() + sum() ): "+ (Integer) list.stream().mapToInt(Student::getNoofbooks).sum());

        System.out.println("Sum of notes books using Collector averageInt combine (mapToInt() + average() ): "+ list.stream()
                .collect(averagingInt(Student::getNoofbooks)));

        /**
         * GroupingBy will only group the data as per the parameter as we send in the parametere.
         */

        // Grouping by 1
        System.out.println("Group 1 the students based on their names :  "+ list.stream()
                .collect(groupingBy(Student::getName)));
        System.out.println("Group 1 the students based on their stream :  "+ list.stream()
                .collect(groupingBy(Student::getStream)));
        System.out.println("Group 1 the students based on their grades and customize the category :  "+ list.stream()
                .collect(groupingBy(student -> student.getGrade()>10 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println("Group 2 the students based on their stream and customize the category :  "+ list.stream()
                .collect(groupingBy(Student::getStream,Collectors.toList())));

        System.out.println("Group 2 the students based on their stream and customize the category :  "+ list.stream()
                .collect(groupingBy(Student::getStream,groupingBy(student -> student.getNoofbooks()>10))));

        // Grouping by 2 will group at two level means map ke andar map
        System.out.println("Group 2 the students based on their grades and names the category :  "+ list.stream()
                .collect(groupingBy(student -> student.getGrade()>10
                        ? "OUTSTANDING" : "AVERAGE",groupingBy(Student::getName))));
        System.out.println("Group 2 the students based on their grades and Sum of notebooks the category :  "+ list.stream()
                .collect(groupingBy(Student::getName, Collectors.summingInt(Student::getNoofbooks))));

        System.out.println("Group 2 the students in a stream and max of grade the category :  "+ list.stream()
                .collect(groupingBy(Student::getStream,
                        collectingAndThen(maxBy(Comparator.comparing(student ->
                                student.getGrade())),Optional::get))));

        System.out.println("Group 2 the students in a stream  and min of grade the category :  "+ list.stream()
                .collect(groupingBy(Student::getStream,
                        collectingAndThen(minBy(Comparator.comparing(student ->
                                student.getGrade())),Optional::get))));
        System.out.println( list.stream()
                .collect(Collectors.toMap(Student::getName,Student::getNoofbooks)));
        System.out.println("Student name as key and object as value : " + list.stream()
                .collect(Collectors.toMap(student -> student.getName().toLowerCase(),
                        student -> student)));


    }
}