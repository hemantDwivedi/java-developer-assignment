package thisandsuper;

// 4. Call argument constructor of current class using this().

public class Q4 {
    public static void main(String[] args) {
        Example example = new Example();
    }
}


class Example{
    Example(){
        this(3);
    }
    Example(int x){
        System.out.println(x);
    }
}