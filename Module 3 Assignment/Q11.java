package Mod3_Assignment.set2;

public class Q5 {
    private static class NumberPrinter extends Thread {
        private volatile boolean running = true;
        public void run() {
            int i = 1;
            while (running && i <= 100) {
                System.out.println(i++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread stopped.");
        }
        public void stopRunning() {
            running = false;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        NumberPrinter t = new NumberPrinter();
        t.start();

        Thread.sleep(2000); 
        t.stopRunning();  
        t.join();
    }
}