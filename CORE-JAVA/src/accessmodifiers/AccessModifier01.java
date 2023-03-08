package accessmodifiers;

/*1. Create a class with PRIVATE fields, private method and a main method. Print the fields
        in main method. Call the private method in main method.
        Create a subclass and try to access the private fields and methods from sub class.*/

public class AccessModifier01{
    private int id = 10;
    private String name = "hemant";

    private void print(){
        System.out.println("ID -> " + id + " Name: " + name);
    }

    public static void main(String[] args) {
        AccessModifier01 am = new AccessModifier01();
        System.out.println(am.id);
        System.out.println(am.name);
        am.print();


        // This class is same package 'acessmodifiers'.
        AccessModifier02 am2 = new AccessModifier02();
        System.out.println(am2.am2);
        am2.am2();
    }
}

class sub extends AccessModifier01{
    private void show(){
        // System.out.println(id + name); // Error: 'id' and 'name' has private access in AccessModifier01.
        // print(); // Error: print() method has private access in AccessModifier01.
    }
}