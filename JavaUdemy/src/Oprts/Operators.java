package Oprts;

public class Operators {
    public static void main(String[] args) {
        System.out.println(Operators());
    }
    public static String Operators(){
        String x = "Harmeet";
        String y = "harmeet";
        int x1 = 1;
        int y1 = 1;


        if(x1==y1){
            System.out.println("Both are same");
        }
        if(x.equalsIgnoreCase(y)){
            System.out.println("both string objects are same");
        }

        return x +" "+ y;
    }
}
