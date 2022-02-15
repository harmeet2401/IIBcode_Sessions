import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println(countdigit());
    }
    public static int countdigit(){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of the array");
       int count = 0;
       int size = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        System.out.println("Enter the integer array");
        for (int i = 0; i < size; i++) {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);
        for (int i = 0; i <arrayList.size() ; i++) {
            for (int j = i+1; j < arrayList.size()-1; j++) {
                if(arrayList.get(i)==arrayList.get(j)){
                    ++count;
                    arrayList.remove(j);
                }
            }
        }

    return count;
    }
}
