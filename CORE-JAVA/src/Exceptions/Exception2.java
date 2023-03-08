package Exceptions;

// 2. Handle the Arithmetic exception using try-catch block.

public class Exception2 {
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
