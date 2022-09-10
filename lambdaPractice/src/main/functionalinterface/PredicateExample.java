package main.functionalinterface;

import main.bean.Student;
import main.service.StudentsService;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    static  Predicate<Student> predicate_books = (student)->{
        if(student.getBooks()>30){
            return  true;
        }
        return false;
    };
    /*static BiPredicate<Students,Integer> StudentWithMorethe30BooksFromCSE_CSE2 = (student,nofbooks) ->{
        if(student.getBooks()>nofbooks &
                (student.getStreamname().equalsIgnoreCase("CSE")|
                        student.getStreamname().equalsIgnoreCase("CSE-2"))){
                return true;
        }
        return  false;
    };*/
    static Predicate<Student> StudentWithMorethe30BooksFromCSE_CSE2 = (student) ->{
        if((student.getStreamname().equalsIgnoreCase("CSE")|
                        student.getStreamname().equalsIgnoreCase("CSE-2"))){
            return true;
        }
        return  false;
    };
    static Predicate<String>predicate = (name)->{
      if(name.equalsIgnoreCase("Harmeetsingh")){
          return true;
      }
      return false;
    };
    static  Predicate<String> predicate1 = (name)->name.equalsIgnoreCase("state");
    static  Predicate<String> predicate2 = (name)->name.equalsIgnoreCase("Harmeetsingh")?true:false;
    public static void main(String[] args) {
        List<Student> students = StudentsService.getStudents();
        //StudentWithBooksMoreThen(students,20);
        StudentWithMorethe30BooksFromCSE_CSE2(students,30);

    }
    public static void StudentWithMorethe30BooksFromCSE_CSE2(List<Student> students , Integer nofbooks){
            students.forEach((student)->{
                if(StudentWithMorethe30BooksFromCSE_CSE2.and(predicate_books).test(student))
                {
                    System.out.println("AND condition :  "+student);
                }

            });

        students.forEach((student)->{
            if(StudentWithMorethe30BooksFromCSE_CSE2.or(predicate_books).test(student))
            {
                System.out.println("OR condition :  "+student);
            }

        });
    }
    public static void StudentWithBooksMoreThen(List<Student> students , Integer nofbooks){

        students.forEach(student -> {
                    if(predicate_books.test(student)){
                        System.out.println(student);
                    }
                }
        );
    }

    public static void sampleSol(){
        System.out.println( "predicate - "+predicate.test("Harmeetsingh"));
        System.out.println( "predicate1 - "+predicate1.test("Harmeetsingh"));
        System.out.println("predicate "+predicate.negate().test("HarmeetSingh"));
        System.out.println(predicate.and(predicate1).test("Harmeet singh"));
        System.out.println(predicate.or(predicate2).test("Harmeetsingh"));
        Predicate<String> t = predicate.and(predicate2).and(predicate1);
        System.out.println(t.test("state"));
    }
}
