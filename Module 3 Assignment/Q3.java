package Mod3_Assignment.set1;

class ChildThread extends Thread {
    public void run() {
        try {
            Thread.sleep(3000); 
            System.out.println("Child thread finished task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        ChildThread child = new ChildThread();
        child.start();
        child.join();  // Wait for child to finish
        System.out.println("Main thread has finished.");
    }
}