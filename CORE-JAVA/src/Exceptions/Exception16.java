package Exceptions;

// 16. Write a program to generate NumberFormatException.

public class Exception16 {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt("hello");
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
