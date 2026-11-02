import java.io.FileInputStream;
import java.io.IOException;

/**
 * Rule 07: Exceptional Behavior (ERR)
 * ERR00-J: Do not suppress or ignore checked exceptions.
 * COMPLIANT: Handle failure and avoid false success.
 */
public class R07_ERR00_J {
    public static void main(String[] args) {
        try (FileInputStream input =
                new FileInputStream("hw02-missing-directory/config.txt")) {
            input.read();
            System.out.println("Configuration loaded successfully!");
        } catch (IOException e) {
            System.out.println("Configuration load failed: "
                    + e.getClass().getSimpleName());
            System.out.println("Stopping without using missing configuration.");
            return;
        }
    }
}
