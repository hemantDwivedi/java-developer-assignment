package String;

// 6. Matching a String Against a Regular Expression With matches().

public class String06 {
    public static void main(String[] args) {
        String  msg = new String("this is a message. example of regular expression.");

        System.out.println(msg.matches("(.*)regular(.*)")); // Output: true
    }
}
