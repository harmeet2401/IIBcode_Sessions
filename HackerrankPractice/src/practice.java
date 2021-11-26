import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

class AirPlane{
    public  AirPlane() throws IOException {
        System.out.println("AirPlane");
        throw new IOException();
        }
}
class AirJet extends  AirPlane{
    public  AirJet() throws IOException{
        System.out.println("AirJet");
        //super();
    }

}
public class practice {

    public static void main(String arg[]) {
        System.out.println("--------------Array List------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("Harmeet");
        list.add("Aarmeet");
        list.add("Barmeet");
        list.add("Carmeet");
        Collections.sort(list);
        for (String l:list
             ) {
            System.out.println(l);
        }  ;

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(102);
        integers.add(72);
        integers.add(02);
        integers.add(52);
        integers.add(36);
        integers.add(25);
        Collections.sort(integers);
        for (Integer i :
             integers) {
            System.out.println(i.toString());
        }
        System.out.println("--------------Array List------------");


        System.out.println("--------------Linked List------------");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Link-Harmeet");
        linkedList.add("Link-Aarmeet");
        linkedList.add("Link-Barmeet");
        linkedList.add("Link-Carmeet");
        Collections.sort(linkedList);
       linkedList.forEach(value-> System.out.println(value));

        System.out.println("--------------Linked List------------");


        System.out.println("-----------Hashmap ------------");

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","BMW");
        hashMap.put("2","Chevrolet");
        hashMap.put("3","Royalce Royece");
        hashMap.put("4","WOLKWOGEN");
        hashMap.put("5","AUDI");


        //lambda expression
        hashMap.values().forEach(value->{
            System.out.println(" "+value);
        });
        hashMap.keySet().forEach(key->{
            System.out.println(" "+key);
        });
        System.out.println("-----------Hashmap ------------");

        System.out.println("-----------HashSet ------------");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("BMW");
        hashSet.add("bmw");
        hashSet.add("bmw");
        hashSet.add("bmw");
        hashSet.forEach(element -> System.out.println(element));
        System.out.println("-----------HashSet ------------");

        System.out.println("-----------Iterator ------------");
        Iterator arrayListIt = list.iterator();
        arrayListIt.forEachRemaining(elm->{
            System.out.println(elm);
        });
        Iterator linkedLIstIt = linkedList.iterator();
        linkedLIstIt.forEachRemaining(lelm-> System.out.println(lelm));

        Iterator hashMapKeyIt = hashMap.keySet().iterator();
        hashMapKeyIt.forEachRemaining(hashkeyel-> System.out.println(hashkeyel));

        Iterator hashMapValueIt = hashMap.keySet().iterator();
        hashMapKeyIt.forEachRemaining(hashvalueel->{
            System.out.println(hashvalueel);
        });
        Iterator hashSetIt = hashSet.iterator();
        hashSetIt.forEachRemaining(hashsetel-> System.out.println(hashsetel));


        System.out.println("-----------Iterator ------------");

    }
}