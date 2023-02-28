package Static;

// 4. Call instance methods in static methods.

public class Question4 {
    public void print(){
        System.out.println("this is instance method.");
    }
    public static void m(){
//        print();
//        Error: non-static methods cannot be referenced to static method.
    }
}
