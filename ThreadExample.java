class ThreadDemo extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +  " is running: " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();

        ThreadDemo t2 = new ThreadDemo();
        t2.start();
    }
}
