package exception;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

public class ExceptionHanlderClass {
    public static int arr[] = {1,2,3,4};

    public static void main(String[] args) {
        try {
            doSome();
        }catch(NumberFormatException ex){
            System.out.println(ex.getMessage());
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }catch(ArithmeticException ex){
            System.out.println("Some arithmetic error");
        }catch(Exception e){
            System.out.println("Exception : -" + e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Running finally block to release all unclosed connections for stream buffer ,db or network");
        }
    }
    public  static void doSome() throws NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException, MyException {

            System.out.println("Enter the idex to see the elements");
            Scanner index = new Scanner(System.in);
            int arrayindex =index.nextInt();
            if(arrayindex > 4){
                throw new MyException("Enter the index from 1 to 4");
            }
            System.out.println("array value : " + arr[arrayindex - 1]);

    }
}
