package loops;

// 12. Print gender (Male/Female) program according to given M/F using switch.

import java.util.Scanner;

public class AnotherSwitchProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char gender = scanner.next().charAt(0);

        switch (gender){
            case 'M' -> System.out.println("Male");
            case 'F' -> System.out.println("Female");
        }
    }
}
