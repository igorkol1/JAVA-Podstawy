package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        String str = "Java-zadania-podzial-napisow";
        Arrays.stream(onlyTwoElements(str, '-')).forEach(element -> System.out.println(element));
    }

    private static String[] onlyTwoElements(String str, char separator) {
        return str.split(String.valueOf(separator), 2);
    }

}