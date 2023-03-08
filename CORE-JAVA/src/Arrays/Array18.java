package Arrays;

// 19. Write a function to find the missing number of sorted array of 1 to 100.

public class Array18 {
    public static void findMissingNumber(int[] arr){
        int number = 1;
        for (int j : arr) {
            if (number != j) System.out.println(number);
            number++;
        }
    }
}
