package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(readFromFile("Main1.txt"));
    }

    public static String readFromFile(String filePath) {
        File file = new File(filePath);
        StringBuilder reading = new StringBuilder();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                reading.append(scan.nextLine() + ",\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }
        return reading.toString();
    }
}
