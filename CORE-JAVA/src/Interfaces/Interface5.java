package Interfaces;

/* 5. Create two interfaces with the same method (same signature) in both the interfaces.
        Implement these two interfaces in one class. Call the method.*/

interface Interface5 {
    abstract void print();
}
interface I1{
    abstract void print();
}

class T5 implements I1, Interface5{
    public void print(){
        System.out.println("Hello print() method.");
    }
}
