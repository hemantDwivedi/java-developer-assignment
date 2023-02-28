package String;

// 5. Searching in strings using indexOf().

public class String05 {

    public static void main(String[] args) {
        String message = new String("this is a message");

        int index = message.indexOf('g'); // return first occurrence of specific character in a string.

        System.out.println("indexOf g -> " + index);
    }
}
