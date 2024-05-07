package N2EX1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exercise2 {
    public static void runProgram(){
        // Creating the first list
        List<Integer> firstList = new ArrayList<Integer>();

        // Filling in the first list
        firstList.add(5);
        firstList.add(19);
        firstList.add(80);
        firstList.add(45);
        firstList.add(32);

        System.out.println("Showing the first list");
        for (int i = 0; i < firstList.size(); i++) {
            System.out.println(firstList.get(i));
        }
        System.out.println();

        // Creating the second List
        List<Integer> secondList = new ArrayList<Integer>();

        // Creating the ListIterator
        ListIterator<Integer> iterator = firstList.listIterator(firstList.size());

        // Inserting the values in the second list
        while(iterator.hasPrevious()){
            secondList.add(iterator.previous());
        }

        System.out.println("Showing the second list");
        for (int i = 0; i < secondList.size(); i++) {
            System.out.println(secondList.get(i));
        }
    }
}
