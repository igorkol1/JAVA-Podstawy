package a_Zadania.a_Dzien_1.b_Metody;


public class Main4 {

    public static void main(String[] args) {
        String modifiedName = createName("Igor", "Kołodziejczyk", "Itachi");
        System.out.println(modifiedName);
    }

    private static String createName(String name, String surname, String alias) {
        return name + " " + alias + " " + surname;
    }
}
