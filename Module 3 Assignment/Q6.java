package Mod3_Assignment.set1;

class PriorityThread extends Thread {
    private int iterations;

    public PriorityThread(String name, int priority, int iterations) {
        super(name);
        this.setPriority(priority);
        this.iterations = iterations;
    }

    public void run() {
        for (int i = 1; i <= iterations; i++) {
            System.out.println(getName() + " - iteration " + i);
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Thread tA = new PriorityThread("Thread A", Thread.MIN_PRIORITY, 5);
        Thread tB = new PriorityThread("Thread B", Thread.NORM_PRIORITY, 5);
        Thread tC = new PriorityThread("Thread C", Thread.MAX_PRIORITY, 5);

        tA.start();
        tB.start();
        tC.start();
    }
}
