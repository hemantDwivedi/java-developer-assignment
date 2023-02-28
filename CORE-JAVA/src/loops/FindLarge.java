package loops;

// 13. Program for multiple if else statement(The largest number in 10,20 and 30).

public class FindLarge {
    public static void main(String[] args) {
        if(10 > 20){
            if(10 > 30) System.out.println(10);
            else System.out.println(30);
        }
        else{
            if(30 > 20) System.out.println(30);
            else System.out.println(20);
        }
    }
}
