package loops;

// 5. Write a program to print largest number among three numbers.

public class PrintLargestNumberAmongThree {
    /* Uncomment me to test. :)
    * public static void main(String[] args){
    *       printLargestNumber(2, 5, 1);
    * }
    * */

    public static void printLargestNumber(int i, int j, int k){
        if(i > j){
            if(i > k) System.out.println(i + " is largest number.");
            else System.out.println(k + " is largest number.");
        }
        else {
            if(j > k) System.out.println(k + " is largest number.");
            else System.out.println(k + " is largest number.");
        }
    }
}
