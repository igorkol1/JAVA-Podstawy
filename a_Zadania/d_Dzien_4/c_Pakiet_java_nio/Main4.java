package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.Main5.getLines;
import static a_Zadania.d_Dzien_4.c_Pakiet_java_nio.Main2.createFile;

public class Main4 {

    public static void main(String[] args) {
        writeToFile("Text.txt");
    }

    private static void writeToFile(String fileName) {
        Path filePath = Paths.get(fileName);
        createFile(fileName);
        List<String> linesToSave = getLines();
        try {
            Files.write(filePath, linesToSave);
        } catch (IOException ex) {
            System.out.println("Nie można zapisać pliku.");
        }
    }

}
