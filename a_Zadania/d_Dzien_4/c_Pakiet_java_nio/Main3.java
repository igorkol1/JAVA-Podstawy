package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main3 {

    public static void main(String[] args) {
        copyFile("Test", "Test1.txt", "Test2.txt");
    }

    private static void copyFile(String directory, String fileName, String secondFileName) {
        Path directoryPath = Paths.get(directory);
        Path filePath = Paths.get(directory + "/" + fileName);
        Path secondFilePath = Paths.get(directory + "/" + secondFileName);
        if (Files.exists(directoryPath) & Files.exists(filePath)) {
            try {
                Files.copy(filePath, secondFilePath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException("Directory or file does not exist");
        }
    }

}
