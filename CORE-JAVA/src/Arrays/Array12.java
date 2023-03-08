package Arrays;

// 12. Write a method to remove duplicate elements from an array.

public class Array12 {
    public static int removeDuplicateElements(int[] arr, int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        if (j >= 0) System.arraycopy(temp, 0, arr, 0, j);
        return j;
    }
}
