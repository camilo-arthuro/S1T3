package N1EX3;

import java.io.*;
import java.util.*;

public class Exercise3 {
    static Scanner input = new Scanner(System.in);

    public static void runProgram(){
        //Variables
        String userName = "";
        String capital = "";
        int point = 0;

        //Request the username and start the game
        System.out.println("Welcome, enter your username:");
        userName = input.next();
        getRandomCountry(userName,capital,point);
    }

    //Read the file.txt and save the data in a HashMap<String, String>
    public static Map<String, String> readFile(){
        Map<String, String> capitals = new HashMap<String, String>();

        try (FileReader fr = new FileReader("src/main/java/N1EX3/txt/countries.txt"); BufferedReader br = new BufferedReader(fr)){
            String line = "";
            String[] parts;
            boolean complete = false;

            while (!complete){
                line = br.readLine();
                if(line!=null){
                    parts = line.split(" ");
                    capitals.put(parts[0],parts[1]);
                } else {
                    complete = true;
                }
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return capitals;
    }

    public static void getRandomCountry(String userName, String capital, int point){
        ArrayList<String> key = getCountries();
        ArrayList<String> value = getCity();
        Random random = new Random();
        int randomNum = 0;
        String randomCountry = "";
        String randomCity = "";

        for (int i = 0; i < 10; i++) {
            randomNum = random.nextInt(key.size());
            randomCountry = key.get(randomNum);
            randomCity = value.get(randomNum);

            System.out.println("Ok " + userName + " guess the capital of: " + randomCountry);
            capital = input.next();
            if (capital.equalsIgnoreCase(randomCity)){
                point++;
                System.out.println("Excellent! You have " + point + " points");
            } else {
                System.out.println("Sorry! No points at this time, you have " + point + " points");
            }
        }
        saveData(userName, point);
    }

    public static ArrayList<String> getCountries(){
        Map<String, String> map = new HashMap<String, String>();
        ArrayList<String> key;

        map = readFile();
        key = new ArrayList<>(map.keySet());

        return key;
    }

    public static ArrayList<String> getCity(){
        Map<String, String> map = new HashMap<String, String>();
        ArrayList<String> value;

        map = readFile();
        value = new ArrayList<>(map.values());

        return value;
    }

    //Save the results in a new file.txt
    public static void saveData(String userName, int point){
        try (FileWriter results = new FileWriter("src/main/java/N1EX3/txt/classificacio.txt", true);BufferedWriter bw = new BufferedWriter(results)){
            String data = "User: " + userName + ". Total points: " + point + "\n";

            bw.write(data);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
