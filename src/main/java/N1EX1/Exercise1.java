package N1EX1;

import N1EX1.Classes.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise1 {
    public static void runProgram() {
        // Creating the ArrayList
        ArrayList<Month> monthList = new ArrayList<Month>();

        // Creating the N1EX1.Classes.Month objects
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

        // Adding the N1EX1.Classes.Month objects to the ArrayList
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

        // Creating and adding the new N1EX1.Classes.Month to the ArrayList
        Month month8 = new Month("August");
        monthList.add(7,month8);

        // Showing the months
        System.out.println("Showing the N1EX1.Classes.Month from the ArrayList");
        for (Month month : monthList){
            System.out.println(month.getName());
        }
        System.out.println();

        // Converting the ArrayList in a HashSet
        Set<Month> hashsetList = new HashSet<Month>(monthList);

        // Repeating a Month
        hashsetList.add(month8);

        System.out.println("Showing the N1EX1.Classes.Month in the HashSet");
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
