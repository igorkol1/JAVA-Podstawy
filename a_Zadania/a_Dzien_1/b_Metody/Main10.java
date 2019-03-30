package a_Zadania.a_Dzien_1.b_Metody;


public class Main10 {

    public static void main(String[] args) {
        String result = footballWin(0, 2, 2, 0);
        System.out.println(result);
    }

    private static String footballWin(int firstMatchScoreA, int firstMatchScoreB, int secoundMatchScoreA, int secoundMatchScoreB) {
        int overallScoreA = firstMatchScoreA + secoundMatchScoreA;
        int overallScoreB = firstMatchScoreB + secoundMatchScoreB;
        if (overallScoreA > overallScoreB) {
            return String.valueOf(1);
        } else if (overallScoreB > overallScoreA) {
            return String.valueOf(2);
        } else if (firstMatchScoreA > secoundMatchScoreB) {
            return String.valueOf(1);
        } else if (secoundMatchScoreB > firstMatchScoreA) {
            return String.valueOf(2);
        }
        return "X";
    }
}
