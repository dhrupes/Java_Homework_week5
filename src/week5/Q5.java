package week5;

import java.util.ArrayList;
import java.util.Iterator;

public class Q5 {

    /* 5. Write a Java program to iterate through all elements in an array list using
Iterator.*/

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Dhrupesh");
        name.add("Dev");
        name.add("Sia");
        name.add("Resh");
        name.add("Krish");
        Iterator i = name.iterator();
        System.out.println("Elements in an array list are: ");
        while (i.hasNext()) {
            System.out.println(i.next());

        }


    }
}
