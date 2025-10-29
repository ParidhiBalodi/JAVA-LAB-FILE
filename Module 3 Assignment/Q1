package Mod3_Assignment.set1;

class NamedThread extends Thread {
    public NamedThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }
}

public class Q1 {
    public static void main(String[] args) {
        NamedThread t1 = new NamedThread("AlphaThread");
        NamedThread t2 = new NamedThread("BetaThread");
        t1.start();
        t2.start();
    }
}
