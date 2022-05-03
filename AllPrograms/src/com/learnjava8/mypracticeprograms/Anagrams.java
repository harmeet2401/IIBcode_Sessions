package com.learnjava8.mypracticeprograms;

import java.util.ArrayList;

class Anagrams{
    public int u=0;
    public int d=0;
    public void fn1(){
        System.out.println("first function ");
    }
    public void fn2(){
        System.out.println("second function ");
    }
    public static void main(String args[])
    {
        if(args.length>0)
            System.out.println(args.length);
        int arr[] = {1, 2, 3, 4, 5};
        for ( int i = 0; i < arr.length - 2; ++i)
            System.out.println(arr[i] + " ");

        char chars[] = {'a', 'b', 'c'};
        String s = new String(chars);
        System.out.println(s);
    }
}