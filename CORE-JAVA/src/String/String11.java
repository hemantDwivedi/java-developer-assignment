package String;

// 11. Splitting strings with split().

public class String11 {
    public static void main(String[] args) {
        String test = new String("This is a test");

        String[] words = test.split("\\s");

        // foreach loop:
        for(String str: words) System.out.println(str);
    }
}
