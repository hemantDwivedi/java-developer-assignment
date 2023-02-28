package operators;

// Importing Scanner class for taking input from user.
import java.util.Scanner;

// 4. Write a program to find the two numbers equal or not.

public class FindNumbersEqualOrNot {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int x = scanner.nextInt();
        int xx = scanner.nextInt();
        if(x == xx) System.out.println("Numbers are equal.");
        else System.out.println("Numbers are not equal.");
    }
}