package com.learnjava8.interfaces;

public interface Interface2 extends Interface1{
    default void methodB (){
        System.out.println("The result is from mthod B");
    }

    default void methodA (){
        System.out.println("The result is from mthod A" + Interface2.class);
    }

}
