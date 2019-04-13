package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static a_Zadania.d_Dzien_4.c_Pakiet_java_nio.Main2.createFile;

public class Main5 {

    public static void main(String[] args) {
        readFromFileAndParseToHTML("Text.txt");
    }

    private static void readFromFileAndParseToHTML(String fileName) {
        List<String> htmlLines = new ArrayList<>();
        htmlLines.add("<html>");
        htmlLines.add("<body>");

        Path sourcePath = Paths.get(fileName);
        if (Files.exists(sourcePath)) {
            List<String> lines = Arrays.asList(readFromFile(fileName).split(";"));
            htmlLines.addAll(lines);
        }

        htmlLines.add("</body>");
        htmlLines.add("</html>");

        writeToFile(fileName.substring(0, fileName.indexOf('.')) + ".html", htmlLines);

    }

    public static String readFromFile(String filePath) {
        File file = new File(filePath);
        StringBuilder reading = new StringBuilder();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                reading.append("<p>" + scan.nextLine() + "</p>;");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }
        return reading.toString();
    }

    private static void writeToFile(String fileName, List<String> linesToSave) {
        Path filePath = Paths.get(fileName);
        createFile(fileName);
        try {
            Files.write(filePath, linesToSave);
        } catch (IOException ex) {
            System.out.println("Nie można zapisać pliku.");
        }
    }

}
