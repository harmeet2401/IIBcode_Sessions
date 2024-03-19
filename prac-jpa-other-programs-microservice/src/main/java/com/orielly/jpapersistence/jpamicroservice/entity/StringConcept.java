package com.orielly.jpapersistence.jpamicroservice.entity;


/**
 * Below class shows the funda of STRING INTERNING
 * in which when the string object is going to get create the java check if the string exists in
 * the java string pool and returns its reference if found thats why below
 * a==b which is checking the memory allocation comes out to be true.
 */
public class StringConcept {
    public static void main(String[] args) {
        String a = "harmeet";
        String b = new String("harmeet");
        String c = "harmeet";

        if(a==c){
            System.out.println("Should be true for a and c ");
        }else if(a==b){
            System.out.println("Should be false because created using new key word for new mem allocation for a and b");
        }
    }
}
