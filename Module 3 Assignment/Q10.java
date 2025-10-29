package Mod3_Assignment.set2;
import java.util.LinkedList;
import java.util.Queue;

public class Q4 {
    private static final int CAPACITY = 5;
    private final Queue<Integer> queue = new LinkedList<>();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized(this) {
                while (queue.size() == CAPACITY) {
                    wait();
                }
                queue.add(value);
                System.out.println("Produced " + value);
                value++;
                notify();
            }
            Thread.sleep(500);
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized(this) {
                while (queue.isEmpty()) {
                    wait();
                }
                int val = queue.poll();
                System.out.println("Consumed " + val);
                notify();
            }
            Thread.sleep(500);
        }
    }

    public static void main(String[] args) {
        Q4 pc = new Q4();

        Thread producer = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}