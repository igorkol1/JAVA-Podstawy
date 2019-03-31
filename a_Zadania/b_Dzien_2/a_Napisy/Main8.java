package a_Zadania.b_Dzien_2.a_Napisy;

public class Main8 {
    
    public static void main(String[] args) {
        String str = "TaK";
        System.out.println(toggleChar(str));

    }

    static String toggleChar(String str) {
        char[] strChrArray = str.toCharArray();
        char[] newChrArray = new char[strChrArray.length];
        for (int i = 0; i < strChrArray.length; i++) {
            if (Character.isLowerCase(strChrArray[i])) {
                newChrArray[i] = Character.toUpperCase(strChrArray[i]);
            } else if (Character.isUpperCase(strChrArray[i])) {
                newChrArray[i] = Character.toLowerCase(strChrArray[i]);
            }
        }
        return String.valueOf(newChrArray);
    }
}
