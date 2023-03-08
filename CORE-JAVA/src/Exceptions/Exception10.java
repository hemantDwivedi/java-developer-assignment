package Exceptions;

// 10. Write a program to generate ClassNotFoundException.

public class Exception10 {
    public static void main(String[] args) {
        try{
            Class.forName("Need");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
