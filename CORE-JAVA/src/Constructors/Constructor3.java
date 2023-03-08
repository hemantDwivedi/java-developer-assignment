package Constructors;

// 3. Apply private, public, protected and default access modifiers to the constructor.

class A{
    A(){
        System.out.println("default access modifier constructor.");
    }
    public A(int x){
        System.out.println("public constructor.");
    }
    private A(int x , int y){
        System.out.println("private constructor.");
    }
    protected A(int i, int j, int k){
        System.out.println("protected constructor.");
    }
}

public class Constructor3 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(10);
        // A a3 = new A(10,20); complilation error: private access.
        A a4 = new A(10,20,30);
    }
}
