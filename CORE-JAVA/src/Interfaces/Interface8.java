package Interfaces;
/*
8. Create a PUBLIC interface with fields and methods, fields should have values assigned.
        Implement this interface to some class and print the values of the interface fields and
        call the interface methods*/

public interface Interface8 {
    final int i = 5;
    void print();
}


class Inter8 implements Interface8{
    public void print(){
        System.out.println("printing interface fields....." + i);
    }
}
