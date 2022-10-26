package com.in28minutes.rest.webservices.restfullservice.bean;

public class test {
//it's like a shared variable single copy will be shared to all the objects of the class
   public  int i=0 ;
    test(){

        i++;
    }
    void display (){
        System.out.printf("x:"+i);
    }
    public static void main(String[] args) {
        test t1 = new test();
        test t2 = new test();
        test t3 = new test();
        t1.display();

    }
}
