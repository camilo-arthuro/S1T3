package N2EX1;

import N2EX1.Classes.Restaurant;

import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
    public static void runProgram(){
        // HashSet
        Set<String> restaurantList = new HashSet<String>();

        // Restaurant objects
        Restaurant r1 = new Restaurant("Blue", 10);
        Restaurant r2 = new Restaurant("Blue", 5);
        Restaurant r3 = new Restaurant("Blue", 9);
        Restaurant r4 = new Restaurant("Blue", 9);

        // Adding the restaurants to the list
        restaurantList.add(r1.toString());
        restaurantList.add(r2.toString());
        restaurantList.add(r3.toString());
        restaurantList.add(r4.toString());

        // Showing the result
        for(String list : restaurantList) {
            System.out.println(list);
        }
    }
}
