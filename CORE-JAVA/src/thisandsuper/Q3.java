package thisandsuper;

// 3. Call constructor of the current class using this().

class Current{

    Current(int x){
        this();
        System.out.println(x);
    }
    Current(){
        System.out.println("this is constructor.");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Current current = new Current(10);
    }
}
