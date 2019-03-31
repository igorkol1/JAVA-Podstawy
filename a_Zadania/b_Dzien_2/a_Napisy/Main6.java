package a_Zadania.b_Dzien_2.a_Napisy;

public class Main6 {

    public static void main(String[] args) {
        String str = "codersLabxyz";
        int strLength = str.length();
        char[] convertedString = new char[strLength];
        for (int i = 0; i < strLength; i++) {
            convertedString[strLength - 1 - i] = str.toCharArray()[i];
        }
        System.out.println(String.valueOf(convertedString));
    }

}
