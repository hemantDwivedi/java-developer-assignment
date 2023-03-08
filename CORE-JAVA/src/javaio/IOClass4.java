package javaio;

// 4. Write text to a .txt file using BufferedOutputStream.

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class IOClass4 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(10);
            bufferedOutputStream.close();
            fileOutputStream.close();
            System.out.println("Passed...");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
