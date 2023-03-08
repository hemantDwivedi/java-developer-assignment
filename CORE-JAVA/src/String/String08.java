package String;

// 8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo().

public class String08 {
    public static void main(String[] args) {
        String STR_ONE = "hello world";
        String STR_TWO = "hello java";

        // equalsIgnoreCase().
        System.out.println(STR_ONE.equalsIgnoreCase(STR_TWO));

        // startsWith().
        System.out.println(STR_ONE.startsWith("hel"));

        // endsWith().
        System.out.println(STR_TWO.endsWith("ava"));

        // compareTo().
        System.out.println(STR_ONE.compareTo(STR_TWO)); // Return value: not 0 because both Strings are not equal.
    }
}
