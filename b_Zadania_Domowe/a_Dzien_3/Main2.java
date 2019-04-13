package b_Zadania_Domowe.a_Dzien_3;


public class Main2 {

    public static void main(String[] args) {
        String[] strTab = {"abc", "efg", "hij"};
        System.out.println(safeGet(strTab, 10));

    }

    private static String safeGet(String[] strTab, int index) {
        try {
            return strTab[index];
        } catch (NullPointerException exception) {
            return "Array is null";
        } catch (ArrayIndexOutOfBoundsException exception) {
            return "Index is incorrect";
        }
    }
}
