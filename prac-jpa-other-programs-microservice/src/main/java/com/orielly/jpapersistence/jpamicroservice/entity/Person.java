package com.orielly.jpapersistence.jpamicroservice.entity;

class Boy{
    public static int i ; //it wil have common copy for all objects and access to all.
    public Boy(int i){
        this.i = i;
    }
    public static int getvalue(){
        return i;
    }
}
class Person {
    public static void main(String[] args) {
        System.out.println(Boy.getvalue());
    }

}