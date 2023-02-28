package operators;

// 3. Program to equal operator and not equal operators.

public class EqualAndNotEqual {
    public static void main(String[] args) {
        equalOperator(5, 5);
        notEqualOperator(5,7);
    }

    private static void notEqualOperator(int i, int i1) {

        // Implementing ternary operator for checking number is equal or not.
        String answer = i != i1 ? "true" : "false";
        System.out.println(answer);
    }

    private static void equalOperator(int i, int i1) {
        String answer = i == i1 ? "true" : "false";
        System.out.println(answer);
    }
}
