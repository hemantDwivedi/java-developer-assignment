package Static;

// 3. Print static variables in Instance methods.

public class Question3 {
    public static int i = 10;

    public void print(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Question3 q = new Question3();
        q.print();
    }
}
