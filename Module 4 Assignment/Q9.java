package JAVA_LAB.Mod4_Assignement;

import java.util.*;

class StackGeneric<T> {
    private List<T> stack = new ArrayList<>();

    public void push(T item) { stack.add(item); }
    public T pop() { return stack.remove(stack.size() - 1); }
    public T peek() { return stack.get(stack.size() - 1); }
    public boolean isEmpty() { return stack.isEmpty(); }
}

public class Q9 {
    public static void main(String[] args) {
        StackGeneric<Integer> s1 = new StackGeneric<>();
        s1.push(10); s1.push(20);
        System.out.println(s1.pop());

        StackGeneric<String> s2 = new StackGeneric<>();
        s2.push("Hi"); s2.push("Bye");
        System.out.println(s2.peek());
    }
}
