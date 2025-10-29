package Mod3_Assignment.set2;

class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        int newBalance = balance + amount;
        try {
            Thread.sleep(10); // Simulate processing delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = newBalance;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

public class Q1 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

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