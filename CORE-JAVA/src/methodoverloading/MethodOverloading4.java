package methodoverloading;

/*4. Write two methods with the same name and same number of parameters of different
type and call from main method
*/

class MethodOverloadingExample4{
    void method(int x){
        System.out.println(x);
    }
    void method(String name){
        System.out.println(name);
    }
}

public class MethodOverloading4 {
    public static void main(String[] args) {
        MethodOverloadingExample4 methodOverloadingExample4 = new MethodOverloadingExample4();
        methodOverloadingExample4.method(10);
        methodOverloadingExample4.method("hello world.");
    }
}
