package Arrays;

// 14. Write a method to find number of even number and odd numbers in an array

public class Array14 {
    public static void findEO(int[] arr){
        for(int i : arr){
            if(i % 2 == 0) System.out.println("even - > " + i);
            else System.out.println("odd - > " + i);
        }
    }
}
