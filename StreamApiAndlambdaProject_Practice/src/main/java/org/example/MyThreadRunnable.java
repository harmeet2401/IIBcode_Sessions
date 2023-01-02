package org.example;


/**
 * This is a better technique as we can allow main thread to run independently from the threads we are invoking
 * using the Thread class objects
 */
public class MyThreadRunnable implements  Runnable{

    @Override
    public void run() {
        synchronized (this) {
            try {
                System.out.println("Thread "+Thread.currentThread().getName()+ " going for sleep");
                Thread.sleep(10000);
                synchronized (this) {
                    this.notifyAll();
                    System.out.println("Thread "+Thread.currentThread().getName()+ " will wake up main thread");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public  void letsWait(){
        System.out.println(Thread.currentThread().getName()+" thread entered and going to sleep");
        synchronized (this){
            try {
               Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"woke up ");
        }

    }

    public static void main(String[] args) {
        MyThreadRunnable objthreadRunnable = new MyThreadRunnable();
        //Whenever we create a Thread class object we are invoking a new thread apart from main thread
        Thread t1 = new Thread(objthreadRunnable);
        t1.setName("A");
        t1.start(); // --- this will start the run method defined above
        objthreadRunnable.letsWait();// -- this is the main thread

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Need to write that using Java 8 ");
            }
        };
        new Thread(runnable).start();

        Runnable runnable1 = ()->System.out.println("Running using the lambda functions");

        new Thread(runnable1).start();


      /*  Thread t2 = new Thread(threadRunnable);
        t2.setName("B");
        t2.start(); // --- this will start the run method defined above
        Thread t3 = new Thread(threadRunnable);
        t3.setName("C");
        t3.start(); // --- this will start the run method defined above
*/

    }
}
