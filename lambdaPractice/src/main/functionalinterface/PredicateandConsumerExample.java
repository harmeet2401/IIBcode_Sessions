package main.functionalinterface;

import main.bean.Students;
import main.service.StudentsService;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateandConsumerExample {

    /**
     * We can club below two separate prdicates into one BiPredicate to be used.
     * Which is a better technique to reduce line of codes
     */
    static Predicate<Students> predicate = (student)->(student.getBooks()>=30);
    static Predicate<Students> predicate1 = (student)-> student.getStreamname().contains("CSE");

    BiPredicate<Integer,String> biPredicate = (i,s)-> i>=30 & s.contains("CSE");

    /*
    below BiConsumer to print the data is an extra loc which can be achieved using a single line
     */
    BiConsumer<Integer , String> biConsumer = (i,s)-> System.out.println("Filter by books : " +i+" Stream name : "+s);
    Consumer<Students> consumer = (student)->{
            //if(predicate.and(predicate1).test(student)){
        if(biPredicate.test(student.getBooks(),student.getStreamname())){
                //--Better solutions--> System.out.println("Filter by books : " +student.getBooks()+" Stream name : "+student.getStreamname() );
                biConsumer.accept(student.getBooks(), student.getStreamname());
            }
    };

    public void filterStudentAsGrade(List<Students> studentsList){
            studentsList.forEach(student -> {
                consumer.accept(student);
            });
    }
    public void filterStudentsByClassStream(List<Students> studentsList){
        studentsList.forEach(student -> {
            consumer.accept(student);
        });
    }
    public static void main(String[] args) {
        List<Students> students = StudentsService.getStudents();
        PredicateandConsumerExample p = new PredicateandConsumerExample();
        //p.filterStudentAsGrade(students);
        p.filterStudentsByClassStream(students);
    }
}
