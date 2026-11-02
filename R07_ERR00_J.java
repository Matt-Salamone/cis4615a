import java.io.FileInputStream;
import java.io.IOException;

/**
 * Rule 07: Exceptional Behavior (ERR)
 * ERR00-J: Do not suppress or ignore checked exceptions.
 *
 * NONCOMPLIANT: An IOException is silently ignored.
 */
public class R07_ERR00_J {

    public static void main(String[] args) {
        try (FileInputStream input =
                new FileInputStream("hw02-missing-directory/config.txt")) {
            input.read();
        } catch (IOException ignored) {
            // Vulnerability: ignore the failure.
        }

        System.out.println("Configuration loaded successfully!");
    }
}
