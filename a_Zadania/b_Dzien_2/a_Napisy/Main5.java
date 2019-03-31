package a_Zadania.b_Dzien_2.a_Napisy;

public class Main5 {

    public static void main(String[] args) {
        String[] str = {"Ala ", "ma ", "kota"};
        System.out.println(stringFromArray(str));
    }

    static String stringFromArray(String[] str) {
        String joinedString = "";
        for (String word : str) {
            joinedString += word;
        }
        return joinedString;
    }
}
