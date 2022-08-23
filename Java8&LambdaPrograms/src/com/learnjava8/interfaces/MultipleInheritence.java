package com.learnjava8.interfaces;

public class MultipleInheritence implements Interface1,Interface2, Interface3{
    public static void main(String[] args) {
        MultipleInheritence multipleInheritence = new MultipleInheritence();
        multipleInheritence.methodA();
        multipleInheritence
                .methodB();
        multipleInheritence.methodc();
    }

    public void methodA (){
        System.out.println("The result is from mthod A" + MultipleInheritence.class);
    }
}
