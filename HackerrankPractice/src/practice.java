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
        List li = new ArrayList();
        li.add(0,"test1");
        li.add(1,"test1");

        li.forEach(el-> System.out.println("List : - "+el));
        System.out.println("--------------Array List------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("Harmeet");
        list.add("Aarmeet");
        list.add("Barmeet");
        list.add("Carmeet");
        list.remove(2);
        Collections.sort(list);
        for (String l:list
             ) {
            System.out.println(l);
        }  ;
        ArrayList nolist = new ArrayList();
        nolist.add("Arraylist");
        nolist.add(new Person("Meet","88277",9009));
        nolist.forEach(elements -> System.out.println("non-specific arraylist : - "+elements));
        System.out.println("The person name from person object "+ ((Person)nolist.get(1)).getName());
        System.out.println("The person address from person object "+ ((Person)nolist.get(1)).getAddress());
        System.out.println("The person id from person object "+ ((Person)nolist.get(1)).getId());

        System.out.println("---------------arraylist<Person>");
        ArrayList<Person> nolist1 = new ArrayList<Person>();
        nolist1.add(new Person("beet","88277",9129));
        nolist1.add(new Person("preet","88247",9119));
        nolist1.add(new Person("geet","38277",1009));
        nolist1.add(new Person("jeet","58277",2009));
        Collections.sort(nolist1);
        nolist1.forEach(per-> System.out.println("Each person name : "+ per.getName()));
        System.out.println("---------------arraylist<Person>");

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
        linkedList.addLast("lastelement");
        linkedList.addFirst("firstelement");
         System.out.println(linkedList.getFirst() + " --  "+
        linkedList.getLast());
        Collections.sort(linkedList);
        for (String str:
             linkedList) {
            System.out.println("Printing the linked list using for each method : -"+str);
        }
       linkedList.forEach(value-> System.out.println(value));

        System.out.println("--------------Linked List------------");
        System.out.println("--------------Vector------------");
        Vector<String> vec = new Vector<>();
        vec.add("A");
        vec.add("B");
        vec.add("C");

        vec.forEach(elem-> System.out.println("vector ele : -"+elem));
        System.out.println("--------------Vector------------");


        System.out.println("-----------Hashmap ------------");

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","BMW");
        hashMap.put("2","Chevrolet");
        hashMap.put("3","Royalce Royece");
        hashMap.put("4","WOLKWOGEN");
        hashMap.put("5","AUDI");

        String name = hashMap.get("5");
        System.out.println("the name i fetched using key "+name);

        //lambda expression
        hashMap.values().forEach(value->{
            System.out.println(" "+value);
        });
        hashMap.keySet().forEach(key->{
            System.out.println(" "+key);
        });
        System.out.println("-----------Hashmap ------------");

        System.out.println("-----------HashSet remove the duplicate ------------");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("BMW");
        hashSet.add("bmw");
        hashSet.add("bmw");
        hashSet.add("bmw");
        hashSet.add("Audio");
        HashSet<String> newhash = new HashSet<>(linkedList);
        newhash.forEach(element -> System.out.println(element));
        hashSet.forEach(element -> System.out.println(element));
        System.out.println("-----------HashSet remove the duplicate ------------");

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
