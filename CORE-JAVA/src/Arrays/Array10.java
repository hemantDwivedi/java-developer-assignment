package Arrays;

// 10. Write a function to find the duplicate values of an array.

public class Array10 {
    public static int findDuplicate(int[] arr){

        int start = 0, end = arr.length - 1;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[i] == arr[j]) return arr[i];
            }
        }

        return -1;
    }
}
