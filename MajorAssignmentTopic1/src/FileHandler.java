import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public static void log(String text) {
        try (FileWriter writer = new FileWriter("battle_log.txt", true)) {
            writer.write(text + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
