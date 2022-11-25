package main.bean;

public interface testinterface {
    public int i=9 ;
    default void check(){
        System.out.println("new function added");
    }

    /*
    below method with defination is not allowed in interfaces.
     */
    /*public void b(){
        System.out.println("");
    }*/

    public void c();

}
