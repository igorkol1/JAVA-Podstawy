package b_Zadania_Domowe.a_Dzien_2;

import java.util.Arrays;


public class Main7 {

    public static void main(String[] args) {
        String str = "Ala ma kota i psa";
        String[] words = {"kota", "psa"};
        System.out.println(censor(str, words));
    }

    private static String censor(String str, String[] words) {
        String censoredMessage = "";
        String[] stringInParts = str.split(" ");
        for (int i = 0; i < stringInParts.length; i++) {
            if (isElementInArray(stringInParts[i], words)) {
                stringInParts[i] = "****";
            }
        }
        return censoredMessage.join(" ", stringInParts);
    }

    private static boolean isElementInArray(String word, String[] words) {
        return Arrays.stream(words).anyMatch(element -> element.equals(word));
    }

}
