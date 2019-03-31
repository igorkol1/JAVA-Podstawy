package a_Zadania.b_Dzien_2.a_Napisy;

public class Main2 {

    public static void main(String[] args) {
        String str = "Ala ma kota";
        System.out.println(charPos(str, 'a'));

    }

    private static int charPos(String str, char c) {
        return str.indexOf(c);
    }
}
