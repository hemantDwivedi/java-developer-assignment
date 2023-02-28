package String;

// 1. Different ways creating a string.

public class String01 {
    public static void main(String[] args) {

        // There are two ways to create a string.
        // 1. String literal.
        String name  = "JAVA";

        // 2. new Keyword
        String msg = new String("Hello ");


        // Printing both String variable.
        System.out.println(msg + name);
    }
}
