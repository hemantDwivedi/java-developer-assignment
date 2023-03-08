package Exceptions;

// 15. Write a program to generate NullPointerException.

public class Exception15 {
    public static void main(String[] args) {
        String name = null;
        try{
            if(name.equals("elel")) System.out.println("world");
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
