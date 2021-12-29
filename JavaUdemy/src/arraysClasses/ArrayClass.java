package arraysClasses;

import java.util.ArrayList;

public class ArrayClass {
    public static void main(String[] args) {
        int x = 1;
        int a[] = {1,2,3};
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("----------------------------------");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.forEach(item -> System.out.println(item));

        System.out.println("----------------------------------");
        System.out.println(averageValue(7,9,11));

    }
    public static double averageValue(int a , int b , int c){

        return a+b+c/3;
    }
}
