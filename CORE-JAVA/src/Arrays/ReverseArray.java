package Arrays;

// 9. Write a function to reverse an array of integer values.

public class ReverseArray {
    public static void reverseIt(int[] arr){
        int[] b = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            b[index] = arr[i];
            index++;
        }

        System.out.println("Reverse Array:");
        for (int i = 0; i < b.length - 1; i++) {
            System.out.println(b[i]);
        }
    }
}
