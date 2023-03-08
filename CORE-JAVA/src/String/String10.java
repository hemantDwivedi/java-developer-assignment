package String;

// 10. Replacing characters in strings with replace().

public class String10 {
    public static void main(String[] args) {
        String string = new String("hello");
        String newString = string.replace('o', 's');
        System.out.println(newString); // change "hello" -> "hells"
    }
}
