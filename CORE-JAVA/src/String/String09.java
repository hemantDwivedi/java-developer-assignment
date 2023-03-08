package String;

// 9. Trimming strings with trim().

public class String09 {
    public static void main(String[] args) {
        String string = new String("   Hello world java     ");
        String STR = string.trim(); // It will remove the whitespaces from start and end of the string.

        System.out.println("Before trimming -> " + string);
        System.out.println("After trimming -> " + STR);
    }
}
