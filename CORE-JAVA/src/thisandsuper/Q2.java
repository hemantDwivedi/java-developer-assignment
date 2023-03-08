package thisandsuper;

// 2. Print the fields/instance members of the parent class using super.

class Parent{
    int i = 0;
    String name = "hello";
}

public class Q2 extends Parent{
    void print(){
        System.out.println(super.i + super.name);
    }
}
