package Arrays;

// 11. Write a program to find the common values between two arrays.

public class Array11 {
    public static void commonElement(int[] a, int[] b){
        // array1 = {1,2,32,5,3,11,9}
        // array2 = {2,3,7,4,5,9,99}

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])System.out.println(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,32,5,3,11,9};
        int[] array2 = {2,3,7,4,5,9,99};

        commonElement(array1,array2);
    }
}
