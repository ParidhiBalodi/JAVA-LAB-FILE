package JAVA_LAB.Mod4_Assignement;

class Box<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.addItem("Hello world!");
        System.out.println(b1.getItem());

        Box<Integer> b2 = new Box<>();
        b2.addItem(1539 );
        System.out.println(b2.getItem());
    }
}
