package b_Zadania_Domowe.a_Dzien_4;


import java.util.StringTokenizer;

import static a_Zadania.d_Dzien_4.b_Pliki.Main2.readFromFile;

public class Main2 {

    public static void main(String[] args) {
        count("Main3.txt");
    }

    private static int count(String fileName) {
        String temp = readFromFile(fileName);
        StringTokenizer tokens = new StringTokenizer(temp);
        return tokens.countTokens();
    }

}
