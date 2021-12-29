package exception;

public class MyException extends  Exception{
    public static String message ;
    MyException(String message){
        super(message);
    }
}
