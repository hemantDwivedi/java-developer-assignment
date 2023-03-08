package Arrays;

// 13. Write a method to find the second largest number in an array.
import java.util.Arrays;
public class Array13 {
    public static void findSecondLargestElement(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}
