package accessmodifiers;

/*
* 2. Create a class with DEFAULT fields and methods. Access these fields and methods
from any other class in the same package
* */

public class AccessModifier02 {

    // Accessing these class members in AccessModifier01.
    int am2 = 10;

    void am2(){
        System.out.println("this is method of AccessModifier01");
    }

    public static void main(String[] args) {
        AccessModifier03 am3 = new AccessModifier03();
        am3.printId();
        am3.studentId = 10;
        am3.printId();
    }
}
