package Inheritance;

/*
Create a class with main method. Create an object for each class A, B and C in main
method and call every method of each class using its own object/instance.
*/

public class Question003 {
    public static void main(String[] args) {
        Level1 level1 = new Level1();
        Level2 level2 = new Level2();
        Level3 level3 = new Level3();
        level1.m1();
        level2.m2();
        level3.m3();
    }
}

class Level1{
    void m1(){
        System.out.println("this is level1");
    }
}

class Level2{
    void m2(){
        System.out.println("this is level2");
    }
}

class Level3{
    void m3(){
        System.out.println("this is level3");
    }
}
