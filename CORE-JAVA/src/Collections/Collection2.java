package Collections;

/*
2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map
*/

import java.util.HashMap;

public class Collection2 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>(10);

        // Insert a Key value mapping into the map
        students.put(1, "soname");

        // Fetch the value of a Key
        System.out.println(students.get(1));

        // Create a clone/copy of HashMap
        System.out.println(students.clone());

        //Check if the given Key is in the Map
        if(students.containsKey(1)) System.out.println("Yes");
        else System.out.println("no");

        // Check if the value is in the Map
        if(students.containsValue("soname")) System.out.println("Yes");
        else System.out.println("no");

        // Check if the map is empty
        if(students.isEmpty()) System.out.println("yes");
        else System.out.println("No");

        // Print the size of the Map to the console
        System.out.println(students.size());

        // Print all the Keys of the map to the console
        System.out.println(students.keySet());

        // Print all the Keys of the map to the console
        System.out.println(students.keySet());

        // Remove a specific Key-value pair
        students.remove(1);
        System.out.println("removed...");

        // Copy all the elements of the Map to another Map
        HashMap<Integer, String> copyStudents = new HashMap<>(10);
        copyStudents.putAll(students);
        System.out.println(copyStudents);
    }
}
