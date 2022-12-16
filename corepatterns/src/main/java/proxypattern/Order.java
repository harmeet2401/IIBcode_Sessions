package proxypattern;

import java.util.List;

public class Order {
   private int id;
   private int quantity;
   private String productname;

    public Order(int id, int quantity, String productname) {
        this.id = id;
        this.quantity = quantity;
        this.productname = productname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
}
