package thisandsuper;

// 5. Call constructor of the parent class using super().

class P5{
    P5(){
        System.out.println("Parent class constructor.");
    }
}

class C5 extends P5{
    C5(){
        super();
        System.out.println("Child class constructor.");
    }
}

public class Q5 {
    public static void main(String[] args) {
        C5 c = new C5();
    }
}
