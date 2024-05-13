package N2EX2;

import N2EX1.Classes.Restaurant;
import com.sun.source.tree.Tree;

import java.util.*;

public class Exercise2 {
    public static void runProgram(){
        /*Utilizando la clase del programa anterior, crea la implementación necesaria para que los objetos de
        la clase Restaurante estén ordenados por nombre y por puntuación en orden ascendente.

        Ejemplo:
        nombre: restaurant1, puntuación: 8
        nombre: restaurant1, puntuación: 7
         */
        // Variables
        Set<Restaurant> orderedList = new TreeSet<>();

        // Restaurant objects
        Restaurant r1 = new Restaurant("Blue", 10);
        Restaurant r2 = new Restaurant("Blue", 5);
        Restaurant r3 = new Restaurant("Blue", 9);
        Restaurant r4 = new Restaurant("Blue", 9);

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
