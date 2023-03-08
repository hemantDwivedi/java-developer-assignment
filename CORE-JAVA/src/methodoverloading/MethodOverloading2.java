package methodoverloading;

/*2. Write two methods with the same name but different number of parameters of different
data type and call the methods from main method */

class MethodOverloadingExample2{
    void method(int x){
        System.out.println(x);
    }
    void method(String name, int id){
        System.out.println(name);
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        MethodOverloadingExample2 methodOverloadingExample2 = new MethodOverloadingExample2();
        methodOverloadingExample2.method(10);
        methodOverloadingExample2.method("Hello",10);
    }
}
