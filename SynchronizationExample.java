class BankAccount {
    int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " has insufficient funds for withdrawal of " + amount);
            }
        }
    }
}

class WithdrawThreads extends Thread {
    BankAccount account;
    int amount;

    WithdrawThreads(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        WithdrawThreads t1 = new WithdrawThreads(b1, 700);
        WithdrawThreads t2 = new WithdrawThreads(b1, 700);
        
        t1.start();
        t2.start();
    }
}
