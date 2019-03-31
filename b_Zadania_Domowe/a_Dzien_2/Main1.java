package b_Zadania_Domowe.a_Dzien_2;


public class Main1 {

    public static void main(String[] args) {
        String str = "Ala ma kota i psa";
        System.out.println(encode(str));
    }

    private static String encode(String str) {
        return encode(str, 5);
    }

    protected static String encode(String str, int shift) {
        String encodedString = "";
        int lenght = str.length();
        for (int x = 0; x < lenght; x++) {
            char c = (char) (str.charAt(x) + shift);
            if (c > 'z')
                encodedString += (char) (str.charAt(x) - (26 - shift));
            else
                encodedString += (char) (str.charAt(x) + shift);
        }
        return encodedString;
    }
}
