package loops;

// 10. Write a program to palindrome or not.

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orgNumber = scanner.nextInt();
        ArrayList<Integer> reverseArray = new ArrayList<>();

        // Extracting each digit from orgNumber and adding in reverseArray list.
        while(orgNumber > 0){
            int d = orgNumber % 10;
            reverseArray.add(d);
            orgNumber /= 10;
        }

        // Declaring two variables siz -> which holds the size of reverseArray, and condition initializing false.
        int siz = reverseArray.size() - 1;
        boolean condition = false;
        for(int i = 0; i < siz; i++){

            /*
            * Traversing each element of reverseArray and apply this logic:
            * Example: If input number is 123321.
            * reverseArray: {1,2,3,3,2,1}
            * At i = 0, and siz = 5
            * if(reverseArray.get(i) == reverseArray.get(siz))
            * if(1 == 1) because reverseArray.get(i) = 1, and reverseArray.get(siz) = 1
            * If condition is true changing condition variable value to "true".
            * And siz-- Reason: we are already check siz index value to don't need to check again in next Iteration.
            * */
            if(reverseArray.get(i) == reverseArray.get(siz)) condition = true;
            siz--;
        }
        if(condition) System.out.println("Yes!! This number is palindrome number.");
        else System.out.println("This number is not a palindrome number.");
    }
}
