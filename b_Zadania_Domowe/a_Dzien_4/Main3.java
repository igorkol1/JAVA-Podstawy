package b_Zadania_Domowe.a_Dzien_4;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main3 {

    private static final int MAN_RETIRE_AGE = 65;
    private static final int WOMAN_RETIRE_AGE = 65;

    public static void main(String[] args) {
        //Use file Employees.txt
        String[] employees = collectData();
        String[] pensioners = findPensioners(employees);
        System.out.println(Arrays.toString(pensioners));
    }

    private static String[] findPensioners(String[] employees) {
        List<String> pensioners = new ArrayList<>();
        for (String employee : employees) {
            String[] employeeDatails = employee.split(" ");
            if (employeeDatails.length == 4) {
                if (employeeDatails[3].toUpperCase().equals("M")) {
                    if (countAge(employeeDatails[2]) > MAN_RETIRE_AGE) {
                        pensioners.add(employeeDatails[0] + " " + employeeDatails[1]);
                    }
                } else {
                    if (countAge(employeeDatails[2]) > WOMAN_RETIRE_AGE) {
                        pensioners.add(employeeDatails[0] + " " + employeeDatails[1]);
                    }
                }
            }
        }
        return pensioners.toArray(new String[0]);
    }

    private static String[] collectData() {
        System.out.print("Podaj nazwe pliku: ");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        return readFromFile(filePath);
    }

    protected static String[] readFromFile(String filePath) {
        File file = new File(filePath);
        List<String> temp = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                temp.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }
        return temp.toArray(new String[0]);
    }

    private static int countAge(String year) {
        int yearOfBirth = Integer.parseInt(year);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - yearOfBirth;
    }

}
