package oprtsClasses;

public class Operators {
    public static void main(String[] args) {
        System.out.println(Operators());
    }
    public static String Operators(){
        String x = "Harmeet";
        String y = "harmeet";
        int x1 = 1;
        int y1 = 1;
        int z = 0;

        System.out.println(--x1);
        System.out.println(x1);
        System.out.println("-------------------------------");
        System.out.println(x1--);
        System.out.println(x1);

        boolean b = x.equalsIgnoreCase(y);
        z = x.equalsIgnoreCase(y) ? 100 : 109;
        if(x.equalsIgnoreCase(y) & x.contains("eet")){
            System.out.println("sigle ops is working");
        }
        executeOperations();
        return x +" "+ y +" "+ z;
    }
    static void  executeOperations(){
        int a = -11 + 5 * 2;
        int b = (87 + 4) % 7;
        int c = (33 + -2 * 9)/1;
        int d =  6 % 5 / 3 * 6 - 8;
        System.out.println( "a value : "+a + " | b value : " + b + " | c value : " + c + " | d value : " + d);
    }
}
