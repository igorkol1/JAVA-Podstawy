package a_Zadania.d_Dzien_4.d_External_jar;


import org.apache.commons.lang3.StringUtils;

public class Main4 {

    public static void main(String[] args) {
        String test = "Atak kata";
        test = StringUtils.lowerCase(test);
        System.out.println(StringUtils.equals(test,StringUtils.reverse(test)));

    }


}
