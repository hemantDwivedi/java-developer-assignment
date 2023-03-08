package Exceptions;

// 5. Write a program to throw exception with your own message.

public class Exception5 {
    public static void main(String[] args) {
        try{
            int ans = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("exception occur.");
        }
    }
}
