package Exceptions;

// 9. Write a program to generate ArrayIndexOutOfBoundException.

public class Exception9 {
    public static void main(String[] args) {
        try{
            int[] arr = {1,2,3,4};
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
