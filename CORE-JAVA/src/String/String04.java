package String;

// 4. Extract a string using Substring.

public class String04 {
    public static void main(String[] args) {
        String name = "Sneaky Coder";
        String subName = name.substring(0,6); // Syntax: substring(int startIndex, int endIndex);

        System.out.println("Full String -> " + name);
        System.out.println("Sub-String -> " + subName);

    }
}
