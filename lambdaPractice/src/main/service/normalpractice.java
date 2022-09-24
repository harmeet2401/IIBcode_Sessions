package main.service;
import javax.sound.midi.Soundbank;
import java.net.Inet4Address;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class normalpractice {
    static BiPredicate<Integer,Integer> predicate = (num,arrEl) -> {
        if(num==arrEl.intValue()){
            return true;
        }
        return false;
    };
    static BiConsumer<Integer,int[]> biConsumer = (num,arrel)->
    {
            Arrays.stream(arrel)
                    .forEach((el)->predicate.test(num,el));
    };
    static Function<Stream<int[]>,int[]> function = (arrstream)->{
            return arrstream.findFirst().get();
    };



    public static void otherFunctionality(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the distance in meter");

        int d = in.nextInt();
        int dkm = d/1000;
        System.out.println("Enter the Time in hours  ");

        int h = in.nextInt();
        System.out.println("Enter the time in minutes ");

        int m = in.nextInt();
        System.out.println("Enter the distance in sec");

        int s = in.nextInt();
        float total = h + (m/60) + (s/3600);
        float speed = dkm / total;
        System.out.println("Speed in km/h :  " + speed  );

        Math.pow(3,3);
        /*
         * */

        System.out.print("Input 1st integer: ");
        int firstInt = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = in.nextInt();

        System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
        System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
        System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
        System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));

    }
    public static void main(String[] args) {
        //sort();
        arrayvaluecheck();
        //putToSpecificPosition();
    }
    public static void putToSpecificPosition() {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        List<Integer> list = new ArrayList<>();
        for (int i : my_array) {
            list.add(i);
        }

        // Insert an element in 3rd position of the array (index->2, value->5)

        int Index_position = 2;
        int newValue    = 5;
        int[] new_array = new int[11];

        System.out.println("Original Array : "+Arrays.toString(my_array));
        String j = Arrays.toString(my_array);
        int temp = 0;
        for(int i=0;i<my_array.length;i++) {
            if (i == Index_position) {
                new_array[i] = newValue;
                temp = my_array[i];
            } else {
                new_array[i] = my_array[i];
            }
        }
        new_array[new_array.length-1] = temp;
        System.out.println("New Array: "+Arrays.toString(new_array));
    }

    public static void arrayvaluecheck(){
        int num = 7;
        int arr[] = {3,2,4,5,6,7,8,9,2,3,4,5,2,3,4,10,22};
        //Stream<Integer> stream = (Stream<Integer>) IntStream.of(3,2,4,5,6,7,8,9,2,3,4,5,2,3,4,10,22);//.forEach((el)->biConsumer.accept(num,el));
        biConsumer.accept(num,arr);
        System.out.println("Max"+Arrays.stream(arr).max());
        System.out.println("Min"+Arrays.stream(arr).min());



        Supplier<List<Integer>> supplier = ()->{
                    List<Integer> list = new ArrayList<>();
                return list;
        };
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        //Arrays.stream(arr)

    }
    /**
     * Below function can allow sorting the integer array and string array
     */
    public  static void sort (){
        int arr[] = {10,3,5,1,2,8,7,7,10};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        String arrstr[] = {"Harmeet","Meet","Bob","Preet","Aman"};
        Arrays.sort(arrstr);
        for (String s : arrstr) {
            System.out.println(s);
        }


        for (int i = 1; i<=10;i++){
            for (int j = 1; j<=10;j++){
                System.out.print("-");
            }
            System.out.println("-");
        }
        System.out.println("Sum : - " + IntStream.of(10,3,5,1,2,8,7,7,10).sum());
        System.out.println("Sum by converting the array to a stream : "+ Arrays.stream(arr).sum());
        System.out.println("Average : - " + IntStream.of(10,3,5,1,2,8,7,7,10).average());
        System.out.println("Average by converting the array to a stream : - "+Arrays.stream(arr).average());

    }

}
