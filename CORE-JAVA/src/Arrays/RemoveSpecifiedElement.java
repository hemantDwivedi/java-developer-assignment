package Arrays;

// 5. Write a function to remove a specific element from an array.

public class RemoveSpecifiedElement {
    public static void removeElement(int[] arr, int target){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == target) {
                int j = i + 1;
                newArr[i] = arr[j];
                break;
            }
            newArr[i] = arr[i];
        }

        for (int i = 0; i < newArr.length - 1; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,1,2,0,5};
        removeElement(arr,0);
    }
}
