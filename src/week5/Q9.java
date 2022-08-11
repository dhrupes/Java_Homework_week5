package week5;

import java.util.HashMap;
import java.util.Map;

public class Q9 {


/*9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/


    public static void main(String[] args) {

        HashMap<String, Integer> name = new HashMap<>();

        name.put("Dhrupesh", 10);
        name.put("Dev", 20);
        name.put("Sia", 30);
        name.put("Krish", 40);
        name.put("Saurya", 50);

        for (Map.Entry<String, Integer> nam : name.entrySet()) {
            Integer value = nam.getValue();
            System.out.println(nam);
            // System.out.println(value);

        }
        for (int i : name.values()) {
            System.out.println(i);
        }


    }
}
