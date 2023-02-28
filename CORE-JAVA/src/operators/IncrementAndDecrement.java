package operators;

// 2. Write a method for increment and decrement operators(++, --)

public class IncrementAndDecrement {
    public static void main(String[] args) {

         /* Increment and decrement operators are types:
            1-Post Increment
            2-Pre Increment

            1-Post Decrement
            2-Pre Decrement
         */

        postIncrementMethod(5);
        preIncrementMethod(5);
        postDecrementMethod(10);
        preDecrementMethod(8);
    }

    private static void preDecrementMethod(int i) {
        System.out.println("Pre Decrement Operator -> " + --i);
    }

    private static void preIncrementMethod(int i) {
        System.out.println("Pre Increment Operator -> " + ++i);
    }

    private static void postIncrementMethod(int i) {
        System.out.println("Post Increment Operator -> " + i++);
        System.out.println("Post Increment Operator -> " + i);
    }

    private static void postDecrementMethod(int i) {
        System.out.println("Post Decrement Operator -> " + i--);
        System.out.println("Post Decrement Operator -> " + i);
    }
}
