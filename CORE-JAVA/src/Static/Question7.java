package Static;

// 7. Call static methods and instance methods in main method.

public class Question7 {
    public static void main(String[] args) {
        print();
        // method(); Error: non-static method invoking.
    }

    private void method() {
        System.out.println("this is instance method.");
    }

    private static void print() {
        System.out.println("this is static method.");
    }
}
