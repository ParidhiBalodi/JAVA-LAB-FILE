package JAVA_LAB.Mod4_Assignement;

class NumberBox<T extends Number> {
    private T num;

    public NumberBox(T num) {
        this.num = num;
    }

    public double doubleValue() {
        return num.doubleValue();
    }
}

public class Q3 {
    public static void main(String[] args) {
        NumberBox<Integer> n1 = new NumberBox<>(1);
        NumberBox<Double> n2 = new NumberBox<>(2.675);

        System.out.println(n1.doubleValue());
        System.out.println(n2.doubleValue());
    }
}
