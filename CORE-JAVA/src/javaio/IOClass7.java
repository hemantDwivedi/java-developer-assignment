package javaio;

// 7. Read text from a .txt file using BufferedReader.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IOClass7 {
    public static void main(String[] args) {
        try{
            File file = new File("text.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
