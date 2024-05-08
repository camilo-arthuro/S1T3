package N1EX3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
    public static void runProgram(){
        /*Dado el archivo countrties.txt (revisa el apartado recursos) que contiene países y capitales.
        El programa debe leer el archivo y guardar los datos en un HashMap<String, String>. El programa
        pide el nombre del usuario/a, y después debe mostrar un país de forma aleatoria, guardado en HashMap.
        Se trata de que el usuario debe escribir el nombre de la capital del país en cuestión. Si acierta
        se le suma un punto. Esta acción se repite 10 veces. Una vez solicitadas las capitales de 10 países
        de forma aleatoria, entonces debe guardarse en un fichero llamado classificacio.txt, el nombre del usuario
        y su puntuación.
         */
        //Variables
        Scanner input = new Scanner(System.in);
        String userName = "";
        String capital = "";
        int point = 0;
        Map<String, String> map = new HashMap<String, String>();

        //Request the username and start the game
        System.out.println("Welcome, enter your username:");
        userName = input.next();
        map = readFile();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Ok " + userName + " guess the capital of: " + entry.getKey());
            capital = input.next();
            if (capital.equalsIgnoreCase(entry.getValue())){
                point++;
                System.out.println("Excellent! You have " + point + " points");
            } else {
                System.out.println("Sorry! No points at this time, you have " + point + " points");
            }
        }
    }

    //Read the file.txt and save the data in a HashMap<String, String>
    public static Map<String, String> readFile(){
        Map<String, String> capitals = new HashMap<String, String>();

        try {
            FileReader file1 = new FileReader("src/main/java/N1EX3/txt/countries.txt");
            BufferedReader reader = new BufferedReader(file1);
            String line = "";
            String[] parts;
            boolean complete = false;

            while (!complete){
                line = reader.readLine();
                if(line!=null){
                    parts = line.split(" ");
                    capitals.put(parts[0],parts[1]);
                } else {
                    complete = true;
                }
            }
            file1.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return capitals;
    }

    //Save the results in a new file.txt

}
