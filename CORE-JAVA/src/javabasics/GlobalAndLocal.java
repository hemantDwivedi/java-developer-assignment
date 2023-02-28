package javabasics;

public class GlobalAndLocal {
    public static void main(String[] args) {

//        local variable
        int i = 20;

        print();

        System.out.println("local variable -> "+i);
    }

    // global variable
    static int i = 10;

    public static void print(){
        System.out.println("global variable -> " + i);
    }
}
