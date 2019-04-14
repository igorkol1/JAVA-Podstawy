package b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        System.out.println(count("Text.html"));
    }

    private static int count(String fileName) {
        int lenghtSum = 0;
        File file = new File(fileName);
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                lenghtSum += scan.nextLine().length();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }
        return lenghtSum;
    }
}
