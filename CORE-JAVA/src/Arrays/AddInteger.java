package Arrays;

// 1. Write a function to add integer values of an array.

public class AddInteger {
    public static int Add(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length - 1; i++){
                sum += arr[i];
        }
        return sum;
    }

    /* Uncomment me to test Add method.
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,1,12,12};
        int msg = Add(a);
        System.out.println(msg);
    }*/
}
