package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


public class Main3 {

    public static void main(String[] args) {
        String str = " To jest tekst do ";
        System.out.println(countTokens(str));
    }

    private static int countTokens(String str) {
        str = str.trim();
        return str.split(" ").length;
    }

}