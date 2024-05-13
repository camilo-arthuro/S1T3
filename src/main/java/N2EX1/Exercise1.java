package N2EX1;

import N2EX1.Classes.Restaurant;

import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
    /*Crea una clase llamada Restaurante con dos atributos: nombre(String) y puntuación(int).
    Implementa los métodos necesarios para que no se puedan introducir objetos Restaurante con el mismo nombre
    y puntuación en un HashSet creado en el main() de la aplicación.

    Importante
    Puede haber restaurantes con el mismo nombre con distinta puntuación, pero no puede haber restaurantes con
    el mismo nombre y igual puntuación.
     */
    public static void runProgram(){
        // HashSet
        Set<Restaurant> restaurantList = new HashSet<Restaurant>();

        // Restaurant objects
        Restaurant r1 = new Restaurant("Blue", 10);
        Restaurant r2 = new Restaurant("Blue", 5);
        Restaurant r3 = new Restaurant("Blue", 9);

        // Adding the restaurants to the list
        restaurantList.add(r1);
        restaurantList.add(r2);
        restaurantList.add(r3);

        // Showing the result
        for(Restaurant list : restaurantList) {
            System.out.println("Name: " + list.getName() + ". Score: " + list.getScore() + ". \n");
        }
    }
}
