package methodoverloading;

/*1. Write two methods with the same name but different number of parameters of same type
and call the methods from main method
*/

class MethodOverloadingExample1{
    public void method1(int x){
        System.out.println("method1");
    }
    public void method1(int x, int y){
        System.out.println("another method1");
    }
}

public class MethodOverloading1 {
    public static void main(String[] args) {
        MethodOverloadingExample1 methodOverloadingExample11 = new MethodOverloadingExample1();
        methodOverloadingExample11.method1(10);
        methodOverloadingExample11.method1(5,7);
    }
}
