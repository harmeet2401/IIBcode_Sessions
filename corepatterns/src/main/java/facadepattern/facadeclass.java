package facadepattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        for (int i = 0; i <10; i++) {
            list.add(Integer.toString(i));
        }
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            stringBuffer.append("\n");
            stringBuffer.append(iterator.next());
        }
        return stringBuffer.toString();
    }
}
