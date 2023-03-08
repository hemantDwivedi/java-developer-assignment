package Exceptions;

// 4. Write a program with multiple catch blocks.

public class Exception4 {
    public static void main(String[] args) {
        try{
            int ans = 11/0;

            int[] arr = {1,2,3,4};
            System.out.println(arr[10]);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException.getMessage());
        }
    }
}
