package proxypattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * So this clas will act as a proxy to get the Id and List of orders which will
 * sit in between CustomerImpl and Customer interface
 */
public class CustomerProxyImpl implements  Customer{
    CustomerImpl customer = new CustomerImpl();
    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        List<Order> order = new ArrayList<>();
        order = Arrays.asList(new Order(1,100,"Iphone"),
                new Order(2,200,"Mac"),
                new Order(3,300,"TurboChargers"),
                new Order(4,400,"Cell"));
        return order;
    }
}
