package com.learnjava8.mypracticeprograms;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        wordCountCheck(sentence);
    }


    public static int wordCountCheck(String sentence){
        char[] ar = sentence.toCharArray();
        for (char c : ar) {
            if(('a'<=c | c<='z') || ('A'<=c | c<='Z')){
                System.out.println("Character : -"+c);
            }else if(c==' '){
                System.out.println("Space : "+c);
            }
        }
      return 0;
    }
}
