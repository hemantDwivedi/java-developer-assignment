package javaio;

// 2. Write a program to write text to .txt file using OutputStream.

import java.io.FileOutputStream;

public class IOClass2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
            fileOutputStream.write(10);
            fileOutputStream.close();
            System.out.println("Passed...");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
