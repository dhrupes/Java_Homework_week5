package week5;

import java.util.ArrayList;

public class Q7 {
    /* 7. Write a Java program to test an array list is empty or not. Define array list with
underground tube names */

    public static void main(String[] args) {

        ArrayList<String> tube = new ArrayList<String>();
        tube.add("Brixton");
        tube.add("Stockwell");
        tube.add("Pimlico");
        tube.add("nine elms");
        tube.add("Vauxhall");
        tube.add("Victoria");
        System.out.println(tube);

        if(tube.isEmpty()){
            System.out.println("Array list is empty");
        }
        else {
            System.out.println("Array list is not Empty");
        }
    }



}
