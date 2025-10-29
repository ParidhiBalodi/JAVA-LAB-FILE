package JAVA_LAB.Mod4_Assignement;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
}

public class Q6 {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Age", 25);
        System.out.println(p.getKey() + " = " + p.getValue());
    }
}