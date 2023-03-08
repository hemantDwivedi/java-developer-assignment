package Constructors;
/*
1. Write a class with a default constructor, one argument constructor and two argument
        constructors. Instantiate the class to call all the constructors of that class from a main
class
*/

class C1{
    C1(){
        System.out.println("this is default constructor");
    }

    C1(int x){
        System.out.println("this is one argument constructor.");
    }
    C1(int x, int y ){
        System.out.println("this is two argument constructor.");
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        C1 c = new C1(); // calling default constructor
        C1 c1 = new C1(10);// calling one argument constructor.
        C1 c2 = new C1(10,23); // calling two argument constructor.
    }
}
