package javaio;

// 5. Write a program to read text from .txt file using FileReader.

import java.io.FileReader;

public class IOClass5 {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("text.txt");
            int x = fileReader.read();
            System.out.println((char)x);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
