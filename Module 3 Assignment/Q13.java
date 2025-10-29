package Mod3_Assignment.set3;

import java.io.FileOutputStream;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
        String data = "Java I/O Streams Example";

        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(data.getBytes());
            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}