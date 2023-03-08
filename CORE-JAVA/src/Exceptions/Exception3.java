package Exceptions;

// 3. Write a method which throws exception, Call that method in main class without try block.

public class Exception3 {
    public static void method(){
        int[] arr = {1,2,3,4};
        for (int i = 0; i < arr.length + 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        method();
    }
}
