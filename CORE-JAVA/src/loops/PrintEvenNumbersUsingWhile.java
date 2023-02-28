package loops;

/*
* 6. Write a program to print even number between 10 and 100 using while.
* */

public class PrintEvenNumbersUsingWhile {
    public static void findEven(){
        int i = 10;
        while(i <= 100){
            if(i%2 == 0) System.out.print(i + " ");
            i++;
        }
    }

    /* Uncomment me to test method.
    public static void main(String[] args) {
        findEven();
    }
    */
}
