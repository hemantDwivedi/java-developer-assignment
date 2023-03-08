package javaio;

// 3. Read text from a .txt file using BufferedInputStream.

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class IOClass3 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int x;
            while((x = bufferedInputStream.read()) != -1){
                System.out.println((char)x);
            }
            bufferedInputStream.close();
            fileInputStream.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
