package com.learnjava8.interfaces;

public interface Interface3 extends Interface2 {
    default void methodc (){
        System.out.println("The result is from mthod C");
    }
    default void methodB (){
        System.out.println("The result is from mthod B" +Interface3.class);
    }
    default void methodA (){
        System.out.println("The result is from mthod A" + Interface3.class);
    }


}
