package week5;

import java.util.HashMap;

public class Q10 {

    /*  10.Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.*/

    public static void main(String[] args) {
        HashMap<String, String> zone1 = new HashMap<>();

        zone1.put("Victoria Line", "Victoria");
        zone1.put("District Line","Victoria");
        zone1.put("Circle Line", "Victoria");
        zone1.put("Victoria Line", "Greenpark");
        zone1.put("Picadilly Line","Greenpark");
        zone1.put("Jubilee Line","Greenpark");
        zone1.put("Victoria Line", "Oxford Circus");
        zone1.put("Central line", "Oxford Circus");
        zone1.put("Bakerloo Line ", "Oxford Circus");
        zone1.put("Circle Line", "Liverpool Street");
        zone1.put("Central line", "Liverpool Street");
        zone1.put("Hammersmith & City Line", "Liverpool Street");
        zone1.put("Metropolitan Line", "Liverpool Street");

        if(zone1.containsValue("Liverpool Street")){
            String s = String.valueOf(zone1.keySet());
            System.out.println("Trains Coming on this Station are : "+s);
        }
    }

}
