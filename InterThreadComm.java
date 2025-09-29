class Basket {
    int data;
    boolean empty = true;

    synchronized void produce(int value) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        data = value;
        empty = false;
        System.out.println("Produced: " + value);
        notify();
    }

    synchronized int consume() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        empty = true;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

class Producer extends Thread {
    Basket basket;

    Producer(Basket b) {
        basket = b;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            basket.produce(i);
            try {
                sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    Basket basket;

    Consumer(Basket b) {
        basket = b;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            basket.consume();
            try {
                sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class InterThreadComm {
    public static void main(String[] args) {
        Basket b = new Basket();
        new Producer(b).start();
        new Consumer(b).start();
    }
}
