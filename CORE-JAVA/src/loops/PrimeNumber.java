package loops;

// 9. Write a program to find the prime or not.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean prime = true;

        /* Checking the given number is if 0 and 1 then we know it's not prime number.
         changing value of prime if condition is true.*/
        if(number == 0 || number == 1) prime = false;

        for(int i = 2; i <= number/2; i++){

            // If number is divisible by i, then it's not a prime number.
            if(number%i == 0){
                prime = false;
                break;
            }
        }

        // prime is true for prime number.
        if(prime) System.out.println(number + " is prime number.");
        else System.out.println(number + " is prime number");
    }
}
