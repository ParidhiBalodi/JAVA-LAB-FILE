package Mod3_Assignment.set2;

class BankAccountBlock {
    private int balance = 0;
    private final Object lock = new Object();

    public void deposit(int amount) {
        synchronized (lock) {
            int newBalance = balance + amount;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Q2 {
    public static void main(String[] args) throws InterruptedException {
        BankAccountBlock account = new BankAccountBlock();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final balance: " + account.getBalance());
    }
}