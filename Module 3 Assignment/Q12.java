package Mod3_Assignment.set3;

// 1. Read a text file using FileInputStream and print contents

import java.io.FileInputStream;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
