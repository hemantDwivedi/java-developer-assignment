package Collections;

/*
1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {
    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<>();
        Students.add("Hello Java");
        Students.add("Hello Java");
        Students.add("Hello Java");
        Students.add("Hello Java");
        Students.add("Hello Java");
        Students.add("Hello Java");
        Students.add("Hello Java");
        Students.add("Hello Java");
        Students.add("Hello Java");
        Students.add("Hello Java");

        // Iterate In Students arraylist
        Iterator<String> itr = Students.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Add an element at a specific index.
        Students.add(1,"hello world");

        // Remove an element from the ArrayList, Remove at an index.
        Students.remove(3);

        // Update the element at a specific index.
        Students.set(4,"Hello string");

        // Check the element is present at a particular index.
        if(Students.get(1).equals("hello world")) System.out.println("yes");
        else System.out.println("no");

        // Get an element at a particular index.
        System.out.println(Students.get(5));

        // Find out the size of the ArrayList.
        System.out.println("Numbers of Student present is -> " + Students.size());

        // Check the given element is present in the ArrayList.
        if(Students.get(1).equals("hello")) System.out.println("yes");
        else System.out.println("no");

        // Remove all elements of the ArrayList.
        Students.clear();
        // checks is Students Arraylist is empty or not.
        System.out.println(Students.size()); // 0 means Students Arraylist empty.
    }
}
