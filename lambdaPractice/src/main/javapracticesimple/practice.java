package main.javapracticesimple;

import java.util.Scanner;
import java.util.stream.IntStream;

public class practice {
    public static void main(String[] args) {
        //celciustofehrenhiet();
        //inchtometers();
        AddIntegerInDigit();
    }

    static void celciustofehrenhiet(){
        Scanner in = new Scanner(System.in);
        double f = in.nextDouble();
        double c = (5 * ( f - 32) /9);
        System.out.println("Celcius : "+ c);
    }
    static void inchtometers(){
        Scanner in = new Scanner(System.in);
        double inch = in.nextDouble();
        double meter = (inch * 0.025);
        System.out.println("Meters : "+ meter);
    }

    /**
     * The catch here is % (%10) which will give you the remainder and you can
     * save that digit and then add at the end.
     */
    static void AddIntegerInDigit(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }
}
