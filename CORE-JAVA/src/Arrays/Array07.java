package Arrays;

// 7. Write a function to insert an element at a specific position in the array.

import java.util.Scanner;

public class Array07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        int position = scanner.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        insertElement(arr, element, position);
    }

    private static void insertElement(int[] arr,int element, int position) {
        if(position > arr.length){
            System.out.println("range exceed");
        }
        else {
            int[] tmp = new int[arr.length + 1];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == position - 1) {
                    tmp[index++] = element;
                }
                tmp[index++] = arr[i];
            }

            System.out.print("original array -> ");
            for (int j : arr) {
                System.out.print(j + " ");
            }

            System.out.println();
            System.out.print("after inserting an element array -> ");
            for (int j : tmp) {
                System.out.print(j + " ");
            }
        }
    }
}
