package b_Zadania_Domowe.a_Dzien_4;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        System.out.println(checkFileExist());
    }

    private static boolean checkFileExist() {
        System.out.print("Podaj ścieżke do pliku: ");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        return Files.exists(Paths.get(filePath));
    }
}
