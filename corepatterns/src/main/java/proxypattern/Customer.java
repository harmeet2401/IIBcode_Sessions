package proxypattern;

import java.util.List;

public interface Customer {
    int getId();
    List<Order> getOrders();
}
