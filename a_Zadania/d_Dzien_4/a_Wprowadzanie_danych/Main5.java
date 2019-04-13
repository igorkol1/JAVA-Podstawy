package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        textLines();
    }

    private static void textLines() {
        System.out.println("Wpisane linie: ");
        getLines().stream().forEach(element -> System.out.println(element));
    }

    public static List<String> getLines() {
        Scanner scanner = new Scanner(System.in);
        List<String> textLines = new ArrayList<>();
        String nextString;
        System.out.print("Podaj pierwszy wyraz: ");
        nextString = scanner.nextLine();
        textLines.add(nextString);
        while (!nextString.equals("quit")) {
            System.out.print("Podaj kolejny wyraz: ");
            nextString = scanner.nextLine();
            textLines.add(nextString);
        }
        textLines.remove("quit");
        return textLines;
    }

}
