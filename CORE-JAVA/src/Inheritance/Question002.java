package Inheritance;

/*
* Create three methods in each class, 2 methods are specific to each class and third
method (override method) should be in all three Classes A, B and C
* */

class Aa{
    void method1(){
        System.out.println("method1");
    }
    void method2(){
        System.out.println("method2");
    }
    void print(){
        System.out.println("class Aa");
    }
}

class Bb extends Aa{
    void method3(){
        System.out.println("method3");
    }
    void method4(){
        System.out.println("method4");
    }
    void print(){ // overrider method print.
        System.out.println("class Bb");
    }
}

class Cc extends Bb{
    void method5(){
        System.out.println("method5");
    }
    void method6(){
        System.out.println("method6");
    }
    void print(){ // override print method.
        System.out.println("class Cc");
    }
}
public class Question002 {
}
