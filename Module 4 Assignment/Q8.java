package JAVA_LAB.Mod4_Assignement;

class Util {
    public static <T> void swapElements(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        Util.swapElements(nums, 0, 2);
        for (int n : nums) System.out.print(n + " ");
        
        String[] words = {"Bat", "Rat", "Cat"};
        Util.swapElements(words, 1, 2);
        for (String s : words) System.out.print(s + " ");
    }
}
