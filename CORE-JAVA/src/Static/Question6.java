package Static;

// 6. Print all the static, instance variables in main method.

public class Question6 {
    private int i = 10;
    private static int j = 20;
    public static void main(String[] args) {
        // System.out.println(i); // Error: non-static variable.
        System.out.println(j); // Output: 20
    }
}
