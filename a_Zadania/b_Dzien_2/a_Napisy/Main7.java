package a_Zadania.b_Dzien_2.a_Napisy;

public class Main7 {

    public static void main(String[] args) {

        String str = "A to kanapa pana kota i co";
        System.out.println(isPalindrom(str));
    }

    private static boolean isPalindrom(String str) {
        str = str.replace(" ", "");
        str = str.toLowerCase();
        char[] strArray = str.toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            if (strArray[i] != strArray[strArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
