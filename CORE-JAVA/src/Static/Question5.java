package Static;

// 5. Call static methods in instance methods.

public class Question5 {
    public static void method1(){
        System.out.println("this is static methods.");
    }
    void method2(){
        method1();
    }
}
