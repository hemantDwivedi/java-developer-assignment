package Constructors;

// 5. Try to call the constructor multiple times with the same object.

public class Constructor5 {
    Constructor5(){
        System.out.println("calling constructor....");
    }

    public static void main(String[] args) {
        Constructor5 constructor5 = new Constructor5();
        Constructor5 constructor51 = new Constructor5();
        Constructor5 constructor52 = new Constructor5();
        Constructor5 constructor53 = new Constructor5();
    }
}
