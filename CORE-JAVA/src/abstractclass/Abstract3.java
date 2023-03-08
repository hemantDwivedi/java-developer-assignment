package abstractclass;

// 3. Create an instance for the child class in child class and call abstract methods.

abstract class Abstract3 {
    abstract void print();
}

class child extends Abstract3{
    child ch  = new child();


    void print() {
        System.out.println("this is abstract method");
    }
}


