package accessmodifiers;

/*
* 3. Create a class with PROTECTED fields and methods. Access these fields and methods
from any other class in the same package.
Also, Access the PROTECTED fields and methods from child class located in a different
package
Access the PROTECTED fields and methods from any class in different package
* */

public class AccessModifier03 {
    protected int studentId = 1;

    protected void printId(){
        System.out.println("Student Id is -> " + studentId);
    }

    public static void main(String[] args) {
        AccessModifier04 am4 = new AccessModifier04();
        am4.print();
    }
}
