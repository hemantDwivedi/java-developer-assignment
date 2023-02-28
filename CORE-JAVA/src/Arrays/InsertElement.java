package Arrays;

// 7. Write a function to insert an element at a specific position in the array.

public class InsertElement {
    public static void insert(int[] arr, int pos, int element){
        int[] brr = new int[arr.length + 2];
        for (int i = 0; i < arr.length - 1; i++) {
            if(i == pos - 1){
                brr[i] = element;
                i++;
            }
            brr[i] = arr[i];
        }

        System.out.println("New Array ->");

        for (int i = 0; i < brr.length  - 1; i++) System.out.print(brr[i] + " ");
    }
}
