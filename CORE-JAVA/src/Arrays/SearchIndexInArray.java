package Arrays;

// 3. Write a program to find the index of an array element.

public class SearchIndexInArray {
    public static int findIndex(int[] arr, int target){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 2, 0, 12, 11, -2};
        int target = 0;
        System.out.println(findIndex(a, target)); // index: 4
    }
}
