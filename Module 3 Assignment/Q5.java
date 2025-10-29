package Mod3_Assignment.set1;


public class Q5 {
    private static int counter = 0;

    private static synchronized void increment() {
        counter++;
    }

    static class CounterThread extends Thread {
        private int increments;
        public CounterThread(String name, int priority, int increments) {
            super(name);
            this.setPriority(priority);
            this.increments = increments;
        }
        public void run() {
            for (int i = 0; i < increments; i++) {
                increment();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread highPriority = new CounterThread("HighPriorityThread", 8, 10000);
        Thread lowPriority = new CounterThread("LowPriorityThread", 2, 10000);

        highPriority.start();
        lowPriority.start();

        highPriority.join();
        lowPriority.join();

        System.out.println("Final counter value = " + counter);
    }
}