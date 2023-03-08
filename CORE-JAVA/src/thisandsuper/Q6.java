package thisandsuper;

// 6. Use this() and super() in methods not in constructors.

class Parent6{
    Parent6(){
        System.out.println("Hello");
    }
}

class Child6 extends Parent6{
    Child6(){
        System.out.println("world");
    }
    void method(){
        /*super(); compilation error
        this();*/
    }
}

public class Q6 {
}
