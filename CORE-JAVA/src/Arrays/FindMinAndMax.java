package Arrays;

// 8. Write a function to find the minimum and maximum value of an array.

public class FindMinAndMax {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,0,1};
//        minMaxForSortedArray(arr);
        minMax(arr);
    }

    // We're assuming that the given array is already sorted.

    public static void minMaxForSortedArray(int[] arr){
        System.out.println("Min -> " + arr[0] + " Max -> " + arr[arr.length-1]);
    }

    // If array is not sorted.

    public static void minMax(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                if(arr[i] > arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Min -> " + arr[0] + " Max -> " + arr[arr.length-1]);
    }
}
