package Interfaces;

// 1. Create an interface with only one method and implement it in a class. Call the method
//implemented.

interface Interface1 {
    abstract void print();
}

class A implements Interface1{
    public void print() {
        System.out.println("this is a method");
    }
}
