package javaio;

// 6. Write a program to write text to .txt file using FileWriter.

import java.io.FileWriter;

public class IOClass6 {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("tet.txt");
            fileWriter.write(10);
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
