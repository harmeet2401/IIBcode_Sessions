import java.io.InputStream;
import java.util.Scanner;

import static javax.swing.text.html.HTML.Tag.I;

public class Exercise {
    float x = 5.2f;
    public static void main(String[] args) {
        System.out.println(printResult());
    }

    public static int printResult(){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        /**
         * IN CASE A IS 0 CASE BLOCK A == 5 WILL NOT EXECUTE , CASE(A==1) WILL NOT EXECUTE AND THEN CASE A == 0 WILL EXECUTE
         *          * TO REACH THE TREU STATEMENTS
         */
        switch (a) {
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
            System.out.println("default block ");
        }
        return a;
        // Finally return int value
    }

}