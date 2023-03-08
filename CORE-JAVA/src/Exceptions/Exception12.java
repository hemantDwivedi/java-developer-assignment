package Exceptions;

// 12. Write a program to generate IOException.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exception12 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(file);
            fileInputStream.read();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if (fileInputStream != null){
                    fileInputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
