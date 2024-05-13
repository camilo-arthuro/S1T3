package N2EX2;

import N2EX1.Classes.Restaurant;

import java.util.*;

public class Exercise2 {
    public static void runProgram(){
        // Variables
        Set<Restaurant> orderedList = new TreeSet<>();

        // Restaurant objects
        Restaurant r1 = new Restaurant("Yellow", 10);
        Restaurant r2 = new Restaurant("Blue", 5);
        Restaurant r3 = new Restaurant("Red", 9);
        Restaurant r4 = new Restaurant("Red", 9);

        // Adding the restaurants to the list
        orderedList.add(r1);
        orderedList.add(r2);
        orderedList.add(r3);
        orderedList.add(r4);

        // Showing the result
        for(Restaurant list : orderedList){
            System.out.println(list.toString());
        }
    }
}
