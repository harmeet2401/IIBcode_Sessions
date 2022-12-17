package facadepattern;

public class OrderProcessing {
    public Boolean checkOrder(String name){
        if(name.equalsIgnoreCase("Iphone 14")){
            return true;
        }else if(name.equalsIgnoreCase("Mac")){
            return true;
        }
        return false;
    }
    public String placeOrder(String name){
        return "Order is placed: "+ name;
    }
    public String deliverOrder(String name){
        return "Order is delivered: "+ name;
    }
}
