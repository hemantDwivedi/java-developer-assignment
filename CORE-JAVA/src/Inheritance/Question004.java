package Inheritance;

// Call an overridden method with super class reference to B and C class’s objects

class Super{
    void print(){
        System.out.print("this is super class. ");
    }
}

class Sub1 extends Super{
    void print() {
        super.print();
        System.out.println("calling from Sub1 class...");
    }
}

class Sub2 extends Super{
    void print(){
        super.print();
        System.out.println("Calling from Sub2 class...");
    }
}

public class Question004 {
    public static void main(String[] args) {
        Sub1 sup = new Sub1();
        sup.print();
        Sub2 supp = new Sub2();
        supp.print();
    }
}
