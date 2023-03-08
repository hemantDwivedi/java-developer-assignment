package abstractclass;

/* 2. Create a subClass for an abstract class. Create an object in the child class for the
abstract class and access the non-abstract methods.*/

abstract class Abstract2 {
    abstract void print();

    void show(){
        System.out.println("this is non-abstract method in abstract class");
    }
}

class sub{
    Abstract2 abs = new Abstract2() {
        void print() {
            System.out.println("This is abstract class method");
        }

        void show() {
            super.show();
        }
    };
}
