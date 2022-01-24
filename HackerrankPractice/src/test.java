import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        test1.getValues();// ----------- we can directly call the static function from a static function with
                            // out creating the object of the class.
    }
}

class test1{
    public static void getValues(){
        System.out.println("checking the class functions ");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Integer i = 0; i < 20; i++) {
            arrayList.add(i);
        }
        arrayList.forEach(el-> System.out.println("Added strings to it : -" + el));
        //Collections.shuffle(arrayList);
        arrayList.forEach(el1-> System.out.println("Added strings to it post shuffle  : -" + el1));
        int max = Collections.max(arrayList);
        int min = Collections.min(arrayList);
        System.out.println("Maximum : - "+ max + " Minimum : - "+ min);
    }
}
