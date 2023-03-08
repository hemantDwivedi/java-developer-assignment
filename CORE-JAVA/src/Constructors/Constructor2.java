package Constructors;

// 2. Call the constructors(both default and argument constructors) of super class from a child
// class.

class Super2{
    Super2(){
        System.out.println("default constructor.");
    }
    Super2(int x, int y){
        System.out.println("argument constructor");
    }
}

class Sub2 extends Super2{
    Sub2(){
        super();
    }
    Sub2(int x, int y){
        super(x,y);
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        Sub2 sub = new Sub2();
        Sub2 sub1 = new Sub2(10,2);
    }
}
