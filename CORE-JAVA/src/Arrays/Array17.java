package Arrays;

// 17. Write a method to verify if the array contains two specified elements(12,23).

public class Array17 {
    public static void func(int[] arr, int a, int b){
        int chk = 0;
        for(int i : arr){
            if(i == a) chk++;
            if(i == b) chk++;
        }
        if(chk == 2) System.out.println("Yes");
        else System.out.println("No");
    }
}
