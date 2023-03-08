package Interfaces;

// 3. Use Interface instances to call the implemented method in the implemented class.

public interface Interface3 {
    final int i = 10;
    abstract void print();
}

class Hello implements Interface3{

    public void print(){
        System.out.println("Hello world");
        System.out.println(i);
    }
}
