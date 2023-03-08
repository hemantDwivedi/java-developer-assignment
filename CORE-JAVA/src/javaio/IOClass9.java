package javaio;

// 9. Write a program to read data from properties file.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IOClass9 {
    public static void main(String[] args) {
        try {
            File file = new File("application.properties");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while(bufferedReader.readLine() != null){
                System.out.println(bufferedReader.readLine());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}