class RunnableDemo implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +  " is running: " + i);
        }
    }
}

public class Thread_Interface {
    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();

        Thread t1 = new Thread(r);
        t1.start();

        Thread t2 = new Thread(r);
        t2.start();
    }
}
