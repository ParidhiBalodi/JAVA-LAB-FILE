package JAVA_LAB.Mod4_Assignement;

import java.util.*;

class MinMaxFinder<T extends Comparable<T>> {
    private List<T> list;
    public MinMaxFinder(List<T> list) {
        this.list = list;
    }
    public T findMin() {
        return Collections.min(list);
    }
    public T findMax() {
        return Collections.max(list);
    }
}

public class Q10 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 7, 1, 9);
        MinMaxFinder<Integer> mm1 = new MinMaxFinder<>(nums);
        System.out.println("Min: " + mm1.findMin() + ", Max: " + mm1.findMax());

        List<String> names = Arrays.asList("Tom", "Alice", "Bob");
        MinMaxFinder<String> mm2 = new MinMaxFinder<>(names);
        System.out.println("Min: " + mm2.findMin() + ", Max: " + mm2.findMax());
    }
}