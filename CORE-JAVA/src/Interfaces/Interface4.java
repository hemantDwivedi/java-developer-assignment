package Interfaces;

// 4. Create two interfaces with one method each. Implement these two interfaces in one
//class.

interface Interface4 {
    abstract void print();
}
interface I2{
    void show();
}

class Test implements Interface4, I2{
    public void print(){
        System.out.println("Print method");
    }
    public void show(){
        System.out.println("show method");
    }
}
