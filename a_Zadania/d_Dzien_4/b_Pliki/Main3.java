package a_Zadania.d_Dzien_4.b_Pliki;


import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static a_Zadania.d_Dzien_4.b_Pliki.Main2.readFromFile;

public class Main3 {

    public static void main(String[] args) {
        float sum = 0;
        String temp = readFromFile("Main3.txt");
        String[] numbersToParse = temp.split(",");
        for (String element : numbersToParse) {
            sum += parseToFloat(element);
        }
        System.out.println("Suma: " + sum);
    }

    private static float parseToFloat(String stringToParse) {
        if (stringToParse != null) {
            stringToParse = stringToParse.trim();
            try {

                return Float.parseFloat(stringToParse);
            } catch (NumberFormatException exception) {
                return 0;
            }
        }
        return 0;
    }
}
