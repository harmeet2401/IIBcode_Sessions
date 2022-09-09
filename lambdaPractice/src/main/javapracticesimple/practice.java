package main.javapracticesimple;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.stream.IntStream;

public class practice {
    public static void main(String[] args) {
        //celciustofehrenhiet();
        //inchtometers();
        //AddIntegerInDigit();
        //AddInteger();
        //minToYearsDays();
        //timeGMT();
        calculateBMI();
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
    static void AddInteger (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the new number between 0 to 1000: "); // 234
        int number = input.nextInt();
        int firstnuber = number % 10; // 4
        int remainingnumber = number / 10; // 23
        int secondnumb = remainingnumber % 10;// 3
        int thirdnumber = remainingnumber / 10 ;// 2;
        int sum = firstnuber+secondnumb+thirdnumber;
        System.out.println("the sum of the digits in integer number : "+ sum);


    }

    /**
     * Fn to convert the minutes to days and years
     * 1day =  24 * 60 minutes
     * 1 mins = 1/(24 *60) days
     * n mins = n/(24 *60) days
     *
     *1 year = 365 * 24 * 60 minutes
     *1 min = 1/(365 * 24 * 60) years
     *n min = n/(365 * 24 * 60) years
     *
     *
     */
    static void minToYearsDays(){
        System.out.println("Enter the minutes to convert : ");
        int minutes = new Scanner(System.in).nextInt();
        int years = 0;
        int days = 0;
        days = minutes /(24 * 60);
        years = days / 365;
        days = days % 365;

        System.out.println("years : "+ years +" and "+"days :"+ days );

    }
    static void timeGMT(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        //1 sec = 1000 mill sec
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
       long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

    /**
     * BMI =  Weight (KG)/height(meters * meters)
     *
     */
    static void calculateBMI (){
        // enter in pound : 1 pound = 0.45359237
        double pound = 0.45359237;
        double inch = 0.0254 ;
        System.out.println("Enter the weight : ");
        double weight = new Scanner(System.in).nextDouble();
        // enter in inches . 1 inches = 0.0254 meters ;
        System.out.println("Enter the height : ");
        double height = new Scanner(System.in).nextDouble();

        double BMI = weight * pound / (height * inch * height * inch);
        System.out.println("The BMI for the person is : "+ BMI);

    }

}
