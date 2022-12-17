package facadepattern;

import java.util.*;

public class facadeclass {
    /**
     * So we can add as many classes as we can in this facade class to go for the functionality
     */
    OrderProcessing orderProcessing = new OrderProcessing();
    OrderExport orderexport = new OrderExport();
    public String orderDetails(String name){
        StringBuffer stringBuffer = new StringBuffer();
        if(orderProcessing.checkOrder(name))
        {
            System.out.println("!!!!!!!!!!!Order Exists!!!!!!!!!");
            stringBuffer.append(orderProcessing.placeOrder(name));
        }else{
            System.out.println("No order is there");
        }

        stringBuffer.append(orderexport.export());
        stringBuffer.append("\n");
        stringBuffer.append(orderProcessing.deliverOrder(name));

        List<String> list = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>();

        for (int i = 0; i <10; i++) {
            list.add(Integer.toString(i));
            map.put(i,"String : "+Integer.toString(i));
        }
        Iterator<String> listiterator = list.iterator();

        while (listiterator.hasNext()){
            stringBuffer.append("\n");
            stringBuffer.append(listiterator.next());
        }

        Set<Integer> mapset = map.keySet();
        Collection<String> mapset1 = map.values();
        Iterator<Integer> mapiterator = mapset.iterator();
        Iterator<String> mapiterator1 = mapset1.iterator();
        System.out.println("Set printing.:-----------------");
        while (mapiterator.hasNext()){
            System.out.println("Set key : "+mapiterator.next());
            System.out.println("Set value : "+mapiterator1.next());
        }
        return stringBuffer.toString();
    }
}
