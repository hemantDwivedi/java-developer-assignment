package Arrays;

// 4. Write a function to test if array contains a specific value.

public class FindNumberInArray {
    public static String search(int[] arr, int target){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == target) return "Yes";
        }
        return "No";
    }
}
