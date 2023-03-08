package Collections;

/*3. Create a HashSet with at least 10 elements of type String
Write program covering all the operations of HashSet*/

import java.util.HashMap;
import java.util.HashSet;

public class Collection3 {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>(10);

        students.add("hello");

        System.out.println(students);

        if(students.isEmpty()) System.out.println("yes");
        else System.out.println("no");

        System.out.println(students.size());

        System.out.println(students.toString());

        System.out.println(students.clone());

        System.out.println(students.iterator());
    }

}
