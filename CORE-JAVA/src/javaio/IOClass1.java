package javaio;

// 1. Write a program to read text from .txt file using InputStream.

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOClass1 {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            int i = fileInputStream.read();
            System.out.println((char)i);
            fileInputStream.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
