package operators;

// 6. Program for relational operators (<,<==, >, >==)

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int xx = scanner.nextInt();

        // '<' Relational operator
        if(x < xx) System.out.println(x + " is smaller number than " + xx);

        // '>' Relational operator
        if(x > xx) System.out.println(x + " is greater number than " + xx);

        // '<=' Relational operator
        if(x <= xx) System.out.println(x + " is smaller than and equal " + xx);

        // '>=' Relational operator
        if(x >= xx) System.out.println(x + " is greater than and equal " + xx);

        // '==' relational operator
        if(x == xx) System.out.println(x + " is equal to " + xx);

        // '!=' Relational operator
        if(x != xx) System.out.println(x + " is not equal to " + xx);
    }
}
