package Exceptions;

// 7. Write a program with finally block.

public class Exception7 {
    public static void main(String[] args) {
        try{
            int ans = 20/4;
            System.out.println(ans);
        }
        catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException);
        }
        finally {
            System.out.println("this is finally block.");
        }

        System.out.println("inside main method.");
    }
}
