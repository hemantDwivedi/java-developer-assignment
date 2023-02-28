package Arrays;

// 2. Write a function to calculate the average value of an array of integers.

public class AverageValue {
    public static void average(int[] arr){
        int avg = 0, sum = 0;
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            sum += arr[i];
        }

        avg = sum/len;

        System.out.println(avg);
    }
}
