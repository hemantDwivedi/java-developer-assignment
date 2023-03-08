package Arrays;

import java.util.Arrays;

// 8. Write a function to find the minimum and maximum value of an array.

public class Array08 {
    public static void findMaxAndMin(int[] arr){
        Arrays.sort(arr);
        System.out.println("Minimum value -> " + arr[0]);
        System.out.println("Maximum value -> " + arr[arr.length - 1]);
    }
}
