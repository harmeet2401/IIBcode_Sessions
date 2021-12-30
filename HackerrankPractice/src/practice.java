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
        Person per1 = new Person("beet","88277",9129);
        Person per2 = new Person("beet","88277",9129);
            if(per1==per2){
                System.out.println("equal");
            }else{
                System.out.println("not equals");
            }
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
        //integers.clear();
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
        hashMap.put("2","Chevrolet");
        hashMap.put("3","Royalce Royece");
        hashMap.put("4","WOLKWOGEN");
        hashMap.put("5","AUDI");
        hashMap.put(null,"null value");

        for (Map.Entry<String, String> m:
             hashMap.entrySet()) {
            System.out.println("Hashmap get the value : - "+ m.getKey() +" : "+m.getValue());
        }
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

        System.out.println("-----------Hashtable doesnot allow null on keys and all methods in it an synchronised and removed duplicated------------");
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("1","BMW");
        hashtable.put("2","Chevrolet");
        hashtable.put("2","Chevrolet");
        hashtable.put("3","Royalce Royece");
        hashtable.put("4","WOLKWOGEN");
        hashtable.remove("4");
        //hashtable.put(null,"kk"); /// null pointer exception will be thrown
        for (Map.Entry<String, String> m1:
             hashtable.entrySet()) {
            System.out.println("hastable : -"+m1.getKey()+ " --- "+m1.getValue());
        }
        System.out.println("-----------Hashtable doesnot allow null on keys and all methods in it an synchronised and removed duplicated------------");

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
        HashSet<Person> personHashSet = new HashSet<Person>( );
        personHashSet.add(new Person("beet","88277",129));
        personHashSet.add(new Person("peet","88277",191));
        personHashSet.add(new Person("geet","88277",1929));
        personHashSet.add(new Person("geet","88277",1929));
        personHashSet.forEach(per->{
            System.out.println("persons from hashset : -"+per.getName());  /// duplicates is not removed then we have to override
                                                                            // the equals and hashcode of Object class which Person class extends by default
                                                                            // by generating the hashcode and equals we could able to see the duplicate removed.
        });
        System.out.println("-----------HashSet remove the duplicate ------------");

        System.out.println("----------LinkedHashSet remove the duplicate ------------");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Pineapple");
        linkedHashSet.add("Orange");
        linkedHashSet.forEach(elehash->{
            System.out.println("Linked hashset value :- "+elehash);
        });

        System.out.println("----------Treeset sort the collections in Ascending order and remove the duplicate values  ------------");


        TreeSet<String> treeset = new TreeSet<>();
        treeset.add("Apple");
        treeset.add("Pineapple");
        treeset.add("Banana");
        treeset.add("Grapes");
        treeset.add("Orange");
        treeset.add("Orange");
        treeset.forEach(elehash->{
            System.out.println("Linked hashset value :- "+elehash);
        });

        TreeSet<Person> treesetper = new TreeSet<Person>();
        treesetper.add(new Person("beet","88277",129));
        treesetper.add(new Person("peet","88277",191));
        treesetper.add(new Person("geet","88277",1929));
        treesetper.add(new Person("geet","88277",1929));
        treesetper.forEach(pertree->{
            System.out.println("Treeset holding the person objects :- "+pertree.getName()); // As we have already override the compareto
                                                                                            // method treeset could sort the collection by name
        });

        System.out.println("----------Treeset sort the collections in Ascending order and remove the duplicate values  ------------");

        System.out.println("-----------LinkedHashmap ------------");

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1","BMW");
        linkedHashMap.put("2","Chevrolet");
        linkedHashMap.put("2","Chevrolet");
        linkedHashMap.put("3","Royalce Royece");
        linkedHashMap.put("4","WOLKWOGEN");
        linkedHashMap.put("5","AUDI");
        linkedHashMap.put(null,"null value");

        for (Map.Entry<String, String> m:
                linkedHashMap.entrySet()) {
            System.out.println("LinkedHashmap get the value : - "+ m.getKey() +" : "+m.getValue());
        }
        System.out.println("-----------LinkedHashmap ------------");

        System.out.println("---------------------Treemap it will sort the coll will not allow null on key--------------------------");
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("1","BMW");
        treeMap.put("2","Chevrolet");
        treeMap.put("2","Chevrolet");
        treeMap.put("3","Royalce Royece");
        treeMap.put("4","WOLKWOGEN");
        treeMap.put("5","AUDI");
        //treeMap.put(null,"null value"); // null pointer null is not allowed

        for (Map.Entry<String, String> m2:
                treeMap.entrySet()) {
            System.out.println("treeMap get the value : - "+ m2.getKey() +" : "+m2.getValue());
        }
        System.out.println("---------------------Treemap it will sort the coll will not allow null on key--------------------------");

        System.out.println("---------------------Treemap it will sort the coll will not allow null on key--------------------------");
        //System.out.println("-----------Iterator ------------");
      /*  Iterator arrayListIt = list.iterator();
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

*/
        //System.out.println("-----------Iterator ------------");

    }
}
