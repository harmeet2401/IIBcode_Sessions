import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * This class will cont the elements occurs and return that
 */


/**
 * for array [ 1 2 1 3 5 6]
 * pick 1 compare it with each element and increase the count variable
 */
class duplicateclass{
    public int CheckDuplicate(ArrayList<Integer> arr){
        int count = 0;
        int i = 1;
        Collections.sort(arr);

       /* arr.forEach(element->{
            System.out.println(element);
        });*/
        for (int j = 0; j < arr.size(); j++) {
            for (int k = j+1; k < arr.size()-1; k++) {
                    if(arr.get(j)==arr.get(k)){
                        ++count;
                        arr.remove(j);
                    }
            }
        }
        return count;
    }

    }
    public  class MyDuplicateCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            duplicateclass d = new duplicateclass();
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>(size);
            System.out.println("Enter the array elements");
            for (int i = 0; i < size; i++) {
                arr.add(sc.nextInt());
            }
            System.out.println("The occurence --" +d.CheckDuplicate(arr));

        }
    }

