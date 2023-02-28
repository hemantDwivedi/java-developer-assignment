package Arrays;

// 6. Write a function to copy an array to another array.

public class CopyArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,5,66};
        copyArray(a);
    }
    public static void copyArray(int[] arr){
        int[] b = new int[arr.length];
        System.arraycopy(arr, 0, b, 0, arr.length - 1);
    }
}
