package week5;

import java.util.ArrayList;

public class Q4 {
     /* 4. Write a Java program to create a new array list, add some colours (string) and
    printout the collection using for each loop.*/

    public static void main(String [] args) {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Black");
        colour.add("Red");
        System.out.println(colour);

        //  int size = colour.size();
        //System.out.println(size);

        System.out.println(colour.get(2));

        for(String col:colour){

            System.out.println("The colour is " +col);

        }
    }
}
