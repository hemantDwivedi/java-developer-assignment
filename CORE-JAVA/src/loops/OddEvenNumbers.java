package loops;

// 4. Write a program to print the odd and even numbers.

public class OddEvenNumbers {
    public static void oddEvenNumbers(int n){ // 'n' is range.
        for(int i = 1; i <= n; i++){
            if(i%2 != 0) System.out.println("Odd: " + i);
            else System.out.println("Even: " + i);
        }
    }

    /* Uncomment me to test "oddEvenNumbers" method.
    * public static void main(String[] args){
    *       oddEvenNumbers(100);
    * }
    * */
}
