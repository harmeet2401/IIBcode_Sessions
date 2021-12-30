package thread;

public class MyThreadRunnable implements  Runnable{

    @Override
    public void run() {
        synchronized (this) {
            try {
                System.out.println("Thread "+Thread.currentThread().getName()+ " going for sleep");
                Thread.sleep(100000);
                System.out.println("Thread "+Thread.currentThread().getName()+ " will wake up main thread");
                synchronized (this) {
                    this.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public  void letsWait(){
        System.out.println(Thread.currentThread().getName()+"  thread entered");
        synchronized (this){
            try {
                 wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"woke up ");
    }

    public static void main(String[] args) {
        MyThreadRunnable objthreadRunnable = new MyThreadRunnable();
        Thread t1 = new Thread(objthreadRunnable);
        t1.setName("A");
        t1.start(); // --- this will start the run method defined above
        objthreadRunnable.letsWait();



      /*  Thread t2 = new Thread(threadRunnable);
        t2.setName("B");
        t2.start(); // --- this will start the run method defined above
        Thread t3 = new Thread(threadRunnable);
        t3.setName("C");
        t3.start(); // --- this will start the run method defined above
*/

    }
}
