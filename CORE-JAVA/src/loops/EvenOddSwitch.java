package loops;

// 11. Program to check whether a number is EVEN or ODD using switch.

import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number % 2) {
            case 0 -> System.out.println("Given number is even");
            case 1 -> System.out.println("Given number is odd");
        }
    }
}
