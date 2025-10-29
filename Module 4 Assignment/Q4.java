package JAVA_LAB.Mod4_Assignement;

import java.util.*;

class Example {
    public static void printList(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(150);
        list.add(200);
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        addIntegers(nums); 
        printList(nums);
    }
}