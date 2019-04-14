package b_Zadania_Domowe.a_Dzien_4;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Scanner;

import static b_Zadania_Domowe.a_Dzien_4.Main3.readFromFile;

public class Main7 {

    public static void main(String[] args) {
        //Use file Employees.txt
        System.out.println(rewrite());
    }

    private static boolean rewrite() {
        System.out.print("Podaj nazwe pliku: ");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        boolean status = copyFile(filePath);
        return status && rewriteContent(filePath.replace(".txt", "_2.txt"));
    }

    private static boolean copyFile(String fileName) {
        Path filePath = Paths.get(fileName);
        Path secondFilePath = Paths.get(fileName.replace(".txt", "_2.txt"));
        if (Files.exists(filePath)) {
            try {
                Files.copy(filePath, secondFilePath, StandardCopyOption.REPLACE_EXISTING);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static boolean rewriteContent(String filePath) {
        String[] linesToCopy = readFromFile(filePath);
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            Arrays.stream(linesToCopy).forEach(line -> {
                try {
                    fileWriter.append(line + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            fileWriter.close();
            return true;
        } catch (IOException exception) {
            exception.printStackTrace();
            return false;
        }
    }

}
