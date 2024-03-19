package com.orielly.jpapersistence.jpamicroservice.entity;

public class Vehicle {
    public static int i = 10;
    
    public Vehicle(){
        this.i = 100;
    }
    public static class FourWheeler{
        public static void increaseValue(){
            System.out.println(Vehicle.i);
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println(i);
    }
}
