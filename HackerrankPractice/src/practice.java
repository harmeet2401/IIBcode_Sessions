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

    //below are the instance variables
    int f ;
    int g;
    static int sum = 0;

    public static void main(String arg[]) {
       //CollectionsMethods();
       //feherenheitToCelcius();
       //sumOfIntegerDigits();
        //minutesToYearsDays();
        //timeOffset();
        //sortFunction();
        //printGrid();
        //arrayManipulation();
        stringManipulation();

    }



    private static void CollectionsMethods() {
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
        vec.add("c");
        vec.add("a");
        vec.add("b");
        Collections.sort(vec);
        vec.forEach(elem-> System.out.println("vector ele : -"+elem));
        System.out.println("--------------Vector------------");


        System.out.println("-----------Hashmap ------------");

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","BMW");
        hashMap.put("2","Chevrolet");
        hashMap.put("2","Chevrolet");
        hashMap.put("3","Royalce royal");
        hashMap.put("4","Wolkswogen");
        hashMap.put("5","AUDI");
        hashMap.put(null,"Null Value"); // no null pointer exception is thrown .

        for (Map.Entry<String, String> m:
                hashMap.entrySet()) {
            System.out.println("Hashmap get the value : - "+ m.getKey() +" : "+m.getValue());
        }
        hashMap.clear();
        for (Map.Entry<String, String> m:
                hashMap.entrySet()) {
            System.out.println("2nd : Hashmap get the value : - "+ m.getKey() +" : "+m.getValue());
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
    private static void feherenheitToCelcius(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the feherenheit");
        //local variables
        float feh = in.nextFloat();
        float cel = (feh - 32) * 5/9;
        System.out.println("Celcius : "+cel);


    }
    private static void sumOfIntegerDigits(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer between 0 to 1000");
        Integer num = in.nextInt();
        int sum = 0;
        String numstr = num.toString();
        char[] a = numstr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("print all the chars : "+a[i]);
            sum = sum + Character.getNumericValue(a[i]);

        }
        System.out.println("SUM : "+sum);
    }
    private static void minutesToYearsDays(){
        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
    private static void timeOffset(){
        int in = 90/18; // this will give you the factor of it  5
        int in1 = 90%18; // this will give you the remainder    0
        Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

    }
    private static void sortFunction(){
        TreeSet<String> arrayList = new TreeSet<>();
        System.out.println("Enter he string array");
        Scanner in = new Scanner(System.in);
        arrayList.add(in.nextLine());
        arrayList.add(in.nextLine());
        arrayList.add(in.nextLine());
        arrayList.add(in.nextLine());
        arrayList.add(in.nextLine());
        arrayList.forEach(strel-> System.out.println(strel));
        TreeSet<Integer> num = new TreeSet<>();
        System.out.println("Enter he numberic array");
        num.add(in.nextInt());
        num.add(in.nextInt());
        num.add(in.nextInt());
        num.add(in.nextInt());
        num.add(in.nextInt());
        num.forEach(numel-> System.out.println(numel));

        num.forEach(el ->{

            sum = sum + el;
        });
        System.out.println("sum of the array : "+ sum);


    }
    private static ArrayList<Integer> getCollectionArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array collection");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            arrayList.add(in.nextInt());
        }
        return arrayList;
    }
    private static int[] getArray(){
        //calculate average
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
    private static void printGrid(){
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                System.out.print("-");
            }
            System.out.println("\n");
        }
        int num[] = getArray();
        for (int i = 0; i < num.length ; i++) {
            sum = sum + num[i];
        }
        float average = sum/num.length;
        System.out.println("Average : "+ average);
    }
    private static void arrayManipulation(){
        int index = 0;
        ArrayList<Integer> num = getCollectionArray();
        System.out.println("Remove specific array element to remove from array");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (Integer n : num) {

            if(n==number){
                num.remove(n);
                break;
            }
            index++;
        }
        int finalIndex = index;
        num.forEach(ele-> System.out.println("After delete : "+ ele +" - "+ "index is :"+ finalIndex));


    }
    private static void stringManipulation(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string:");
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        System.out.println("Enter the index for a char to fetch ");
        int index = in.nextInt();
        System.out.println("Character at index : "+index+" char : "+ arr[index]);
    }
    private static void stringUnicode(){
        String str = "w3resource.com";
        System.out.println("Original String : " + str);

        // codepoint at index 1
        int val1 = str.codePointAt(1);

        // codepoint at index 9
        int val2 = str.codePointAt(9);

        // prints character at index1 in string
        System.out.println("Character(unicode point) = " + val1);
        // prints character at index9 in string
        System.out.println("Character(unicode point) = " + val2);
    }
}
