import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    //log text to the battle log file
    public static void log(String text) {
        try (FileWriter writer = new FileWriter("battle_log.txt", true)) { //append mode
            writer.write(text + "\n"); // Write the text followed by a new line
        } catch (IOException e) {
            System.out.println("Error writing to file."); // error if file write fails
        }
    }
}
