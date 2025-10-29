package Mod3_Assignment.set1;

class Q4 extends Thread {
    private String message;

    public Q4(String name, String message) {
        super(name);
        this.message = message;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(message);
                int delay = 100 + (int)(Math.random() * 400); 
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}