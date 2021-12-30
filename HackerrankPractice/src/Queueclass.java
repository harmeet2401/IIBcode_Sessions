import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queueclass {
    public static void main(String[] args) {
        System.out.println("---------------Queue using linkedlist point object----");
        Queue<String> queue = new LinkedList<String>();
        queue.add("Apple");
        queue.add("Grapes");
        queue.add("Oranges");
        queue.add("Banana");


//        queue.remove();
        queue.forEach(qel->{
            System.out.println("Queue elements : -"+qel);
        });
        for (String fruits:
             queue) {
            System.out.println("Fruits : -"+ fruits);

        }
        System.out.println("---------------Queue using linkedlist point object----");

        System.out.println("---------------Queue using PriorityQueue point object do the sorting ----");
        Queue<String> queue1 = new PriorityQueue<>();
        queue1.add("Apple");
        queue1.add("Grapes");
        queue1.add("Oranges");
        queue1.add("Banana");


//        queue.remove();
        queue1.forEach(qel1->{
            System.out.println("Queue elements : -"+qel1);
        });
        for (String fruits:
                queue1) {
            System.out.println("Fruits : --"+ fruits);

        }

        System.out.println("---------------Queue using PriorityQueue point object do the sorting ----");
    }
}
