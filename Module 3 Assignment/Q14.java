package Mod3_Assignment.set3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a string: ");
            String str = br.readLine();

            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(br.readLine());

            System.out.println("String input: " + str);
            System.out.println("Integer input: " + num);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}