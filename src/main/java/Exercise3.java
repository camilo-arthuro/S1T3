import Classes.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise3 {
    public static void runProgram() {
        /*Crea una clase llamada Classes.Month con un atributo "name" (que almacenará el nombre del mes del año).
        Añade 11 objetos Classes.Month (cada uno con su atributo diferente) en un ArrayList, a excepción del objeto con
        atributo "Agost". Después, efectúa la inserción en el sitio que corresponde a este mes y demuestra que
        ArrayList mantiene el orden correcto.

        Convierte ArrayList del ejercicio anterior en un HashSet y asegúrate de que no permite duplicados.
        Recorre la lista con un for y con un iterador.*/

        // Creating the ArrayList
        ArrayList<Month> monthList = new ArrayList<Month>();

        // Creating the Classes.Month objects
        Month month1 = new Month("January");
        Month month2 = new Month("February");
        Month month3 = new Month("March");
        Month month4 = new Month("April");
        Month month5 = new Month("May");
        Month month6 = new Month("June");
        Month month7 = new Month("July");
        Month month9 = new Month("September");
        Month month10 = new Month("October");
        Month month11 = new Month("November");
        Month month12 = new Month("December");

        // Adding the Classes.Month objects to the ArrayList
        monthList.add(month1);
        monthList.add(month2);
        monthList.add(month3);
        monthList.add(month4);
        monthList.add(month5);
        monthList.add(month6);
        monthList.add(month7);
        monthList.add(month9);
        monthList.add(month10);
        monthList.add(month11);
        monthList.add(month12);

        // Creating and adding the new Classes.Month to the ArrayList
        Month month8 = new Month("August");
        monthList.add(7,month8);

        // Showing the months
        System.out.println("Showing the Classes.Month from the ArrayList");
        for (Month month : monthList){
            System.out.println(month.getName());
        }
        System.out.println();

        // Converting the ArrayList in a HashSet
        Set<Month> hashsetList = new HashSet<Month>(monthList);

        // Repeating a Month
        hashsetList.add(month8);

        System.out.println("Showing the Classes.Month in the HashSet");
        System.out.println("Using a for loop");
        for (Month month : hashsetList){
            System.out.println(month.getName());
        }
        System.out.println();

        System.out.println("Using an iterator");
        Iterator<Month> iterator = hashsetList.iterator();
        while (iterator.hasNext()){
            System.out.println("Mes: " + iterator.next().getName());
        }
    }
}
