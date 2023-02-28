package loops;

/*
* 8. Write a program to find Armstrong number or not.
* */

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int originalNumber = scanner.nextInt();
        ArrayList<Integer> digit = new ArrayList<>();
        int temp = originalNumber, power = 0, sum = 0;
        while(temp > 0){
            int d = temp%10;
            digit.add(d);
            temp /= 10;
            power++;
        }
        System.out.println("list printing.... " + digit);

        /* In this for loop 'i' printing three num, total, and sum variable for testing.
         You can uncomment these statements to see what is happening behind logic.*/

        for(int i = 0; i < digit.size(); i++){
            int num = digit.get(i);

            //System.out.println("printing each element in digit list " + num);

            int total = 1;
            for(int j = 1; j <= power; j++) total *= num;

            // System.out.println("printing total -> " + total);

            sum += total;

            // System.out.println("printing sum..... " + sum);
        }
        if(sum == originalNumber) System.out.println(originalNumber + " is armstrong number.");
        else System.out.println(originalNumber + " is not an armstrong number.");
    }
}
