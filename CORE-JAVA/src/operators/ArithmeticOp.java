package operators;

// 1. Write a function for arithmetic operators(+,-,*,/)

// ArithmeticOp class used all methods.
public class ArithmeticOp {
    public static void main(String[] args) {

        // Calling all methods, Which perform Arithmetic Operations.
        add(2,3);
        subtract(10,8);
        mutliplyer(2,2);
        divsion(20,2);
    }

    private static void divsion(int i, int i1) {
        System.out.println(i/i1);
    }

    private static void mutliplyer(int i, int i1) {
        System.out.println(i*i1);
    }

    private static void subtract(int i, int i1) {
        System.out.println(i-i1);
    }

    private static void add(int i, int i1) {
        System.out.println(i+i1);
    }
}
