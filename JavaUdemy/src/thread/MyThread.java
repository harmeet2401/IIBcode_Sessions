package thread;

import javax.sound.midi.Soundbank;

public class MyThread extends  Thread{
    @Override
    public synchronized  void run() {
        synchronized (this) {
            try {
                System.out.println("Thread "+Thread.currentThread().getName()+ " going for sleep");
                Thread.sleep(10000);
                this.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public  void letsWait(){
        System.out.println(Thread.currentThread().getName()+"Main Thread entered");
        synchronized (this){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"woke up ");
    }
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("Thread-A");
        thread.start(); // --- this will start the run method defined above
        thread.letsWait();
/*
        MyThread thread1 = new MyThread();
        thread1.setName("Thread-B");
        thread1.start(); // --- this will start the run method defined above*/

    }
}
