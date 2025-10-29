package JAVA_LAB.Mod4_Assignement;  

class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Q2 {
    public static void main(String[] args) {
        GenericClass<String> g1 = new GenericClass<>("Hello");
        GenericClass<Integer> g2 = new GenericClass<>(100);

        System.out.println(g1.getValue());
        System.out.println(g2.getValue());
    }
}
