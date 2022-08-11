package week5;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    /* 6. Write a Java program to retrieve an element (at a specified index) from a given
array list */

    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        List<String> name = new ArrayList<String>();
        name.add("Dhrupesh");
        name.add("Dev");
        name.add("Sia");
        name.add("Resh");
        name.add("Krish");
        // Print the list
        System.out.println(name);
        // Retrive the first and third element
        String element = name.get(1);
        System.out.println("first element: "+element);
        element = name.get(4);
        System.out.println("Second element: "+element);
    }



}
