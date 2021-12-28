public class Exercise {
    float x = 5.2f;
    public static void main(String[] args) {
        System.out.println(printResult());
    }

    public static int printResult(){
        // Write your logic here
        Exercise e = new Exercise();
        return (int)(e.x);
        // Finally return int value
    }

}