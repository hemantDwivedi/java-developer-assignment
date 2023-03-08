package Exceptions;

// 11. Write a program to generate FileNotFoundException.

import java.io.*;

public class Exception11 {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("hello.txt");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
