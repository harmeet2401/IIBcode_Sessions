import javax.sound.midi.Soundbank;
import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //Old approach to use and call comparator interface which has one function to compare two values of any types.
        // if the a is greator then b then 1 , if both are equal then 0 and if a is less then b then -1

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        };
        System.out.println("The value of compare using old approach :"+ comparator.compare(3,4));

        // Compare function using the lambda function
        Comparator<Integer> comparator1  = (a,b)->{
            return comparator.compare(3,4);
        };
        System.out.println("The value of compare using lambda approach1 :"+ comparator1.compare(3,4));

        Comparator<Integer> comparator2  = (a,b)->   comparator.compare(3,4);

        System.out.println("The value of compare using lambda approach2 :"+ comparator2.compare(3,4));

    }
}
