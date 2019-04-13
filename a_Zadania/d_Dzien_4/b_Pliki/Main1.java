package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import static a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.Main5.getLines;

public class Main1 {

    public static void main(String[] args) {
        List<String> linesToSave = getLines();
        try {
            PrintWriter printWriter = new PrintWriter("Main1.txt");
            linesToSave.forEach(printWriter::println);
            printWriter.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

    }

}
