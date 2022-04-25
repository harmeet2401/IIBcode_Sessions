
public class RunnableLambdaExample {

    public static void main(String[] args) throws InterruptedException {
        RunnableLambdaExample j = new RunnableLambdaExample();
        //Runnable interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("----Runnable interface run");
            }
        };
        new Thread(runnable).start();


        // Running runnable interface above using lambda expressions
        //()->{}
        // Now using this we override the definition of the functions inside @FunctionalInterface runnable interface
        // above run function is writtern above with new body , using lambda we don't need to write the complete functions
        Runnable runnable1 = ()->{
            System.out.println("Running using lambda expresssions.");

        };
        new Thread(runnable1).start();
        TestInterface testInterface = ()-> System.out.println("Applying lambda expression to normal " +
                "                                               interface with one function sin it .");

        new Thread(()-> System.out.println("-----Runnable using 2")).start();

    }

}
