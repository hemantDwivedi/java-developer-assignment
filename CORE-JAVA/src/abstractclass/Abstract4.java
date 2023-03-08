package abstractclass;

// 3. Create an instance for the child class in child class and call non-abstract methods.

abstract class Abstract4 {
    void print(){
        System.out.println("hello");
    }
}

class Child extends Abstract4{
    void print(){
        System.out.println("this is a abstract method");
    }
}
