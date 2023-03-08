package Exceptions;

// 17. Write a program to generate StringIndexOutOfBoundsException.

public class Exception17 {
    public static void main(String[] args) {
        String name = "hello";
        try{
            System.out.println(name.charAt(9));
        }
        catch(StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
