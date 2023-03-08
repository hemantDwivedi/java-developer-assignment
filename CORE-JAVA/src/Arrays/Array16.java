package Arrays;

// 16. Write a function to get the difference of largest and smallest value.

import java.util.Arrays;
public class Array16 {
    public static void func(int[] arr){
        Arrays.sort(arr);
        int ans = arr[arr.length - 1] - arr[0];
        System.out.println(ans);
    }
}
