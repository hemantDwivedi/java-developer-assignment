package Exceptions;

// 8. Write a program to generate Arithmetic Exception.

public class Exception8 {
    public static void main(String[] args) {
        try{
            int ans = 10/0;
            System.out.println(ans);
        }
        catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }
    }
}
