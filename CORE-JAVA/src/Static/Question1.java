package Static;

/* 1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
methods and a main method.*/

public class Question1 {

    // Instance variables
    private int x;
    private int y;

    // Two static variables
    public static int i = 10, j = 20;

    // static method
    public static void print(){
        System.out.println(i);
        System.out.println("hello");
    }
    public static void world(){
        System.out.println(j);
        System.out.println("world.");
    }

    public void message(){
        System.out.println("this is instance method.");
    }

    public void msg(){
        System.out.println("this is an  another method.");
    }

    public static void main(String[] args) {
        Question1 q = new Question1();
        q.message();
        q.msg();
        print();
        world();
    }

}
