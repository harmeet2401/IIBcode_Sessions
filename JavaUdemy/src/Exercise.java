import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.text.html.HTML.Tag.I;

public class Exercise {
    float x = 5.2f;
    public static void main(String[] args) {
        //System.out.println(printResult());
        //printResultLoop();
        //System.out.println(printResultPattern());
        System.out.println(printResultMultipleOf2());
    }

    public static int printResult(){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        /**
         * IN CASE A IS 0 CASE BLOCK A == 5 WILL NOT EXECUTE , CASE(A==1) WILL NOT EXECUTE AND THEN CASE A == 0 WILL EXECUTE
         *          * TO REACH THE TREU STATEMENTS
         */
        switch (a == 0 || a==-1 | a==-2 | a==-4 | a==-3 ? 0 : 10) {
            case (5):
                System.out.println("FIRST BLOCK WITH a = 5");
                break;
            case (1):
                System.out.println("SECOND BLOCK WITH a = 1");
                break;
            case (0):
                System.out.println("THIRD BLOCK WITH a = 0");
                break;
            default :
                System.out.println("DEFAULT BLOCK EXECUTED");
                break;
        }

        /**
         * IN CASE A IS 0 IF BLOCK A == 5 WILL EXECUTE , ELSE-IF(A==1) WILL EXECUTE AND THEN ELSE-IF A == 0 WILL EXECUTE
         * TO REACH THE TRUE STATEMENTS
         */
        if(a ==5){
            System.out.println("FIRST IF WITH a = 5");
        }else if(a==1){
            System.out.println("SECOND ELSE-IF WITH a = 1");
        }
        else if(a==0){
            System.out.println("THIRD ELSE-IF WITH a = 0");
        }
        else {
            System.out.println("default ELSE block ");
        }
        return a;
        // Finally return int value
    }

    public static void printResultLoop(){
        int k = 0;
        int j = 0;

        /**
         * Will run till i is greater then 9
         */
        for (int i = 0; i < 9 ; i++) {
            System.out.println("For loop ::" +i);
        }

        System.out.println("----------------------------------------");

        /**
         * will run till j become greater then 9
         */
        while (j<9){
            System.out.println("While loop ::" +j);
            j++;
        }

        System.out.println("----------------------------------------");
        /**
         * This loop will run atleast once as first time no conditional check is there .
         */
        do {
            System.out.println("Do while  loop ::" +k);
            k++;

        }while(k<9);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("---------------------------------------------");
        for(int e : arrayList){
            System.out.println("Arraylist using enhanced loop :: " + e);

        }
        System.out.println("---------------------------------------------");
        /* lambda statements :
         */
        arrayList.forEach(e-> {
            if(e==5) {
                return;
            }else{
                System.out.println("Arraylist using the lambda expression :: " + e);
            }
        }
        );
        System.out.println("post running all LOC");

    }
    public static String printResultPattern(){
        // Write your logic here to return expected patter as string
       /* for(int j = 0 ; j < 4 ; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }*/
        String finalStr = "";
        for (int i=1;i<=4;i++){
            String s="";
            for(int j=1;j<=i;j++){
                s=s+"*";
            }
            finalStr = finalStr+s+"\n";
        }
        return finalStr;
    }

    public static String printResultMultipleOf2(){
        String finalStr = "";
        // Write the loop logic here. and assign finalStr at end of all iteration
        String s = "";
        for(int m=1;m<=10;m++){
            s = "2 * "+m+" = "+(2*m);
            finalStr=finalStr+s+"\n";
        }
        return finalStr;
    }
}