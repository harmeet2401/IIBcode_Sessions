package proxypattern;

import java.util.List;

public class CustomerImpl implements Customer {
    private int Id;
    private List<Order> orders;
    CustomerImpl(){
        this.Id = 123;
    }
    @Override
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
