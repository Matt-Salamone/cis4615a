import java.io.FileInputStream;
import java.io.IOException;

/**
 * Rule 13: Input Output (FIO)
 * FIO04-J: Release resources when they are no longer needed.
 * COMPLIANT: Automatically close the stream.
 */
public class R13_FIO04_J {
    public static void main(String[] args) throws IOException {
        try (FileInputStream input =
                new FileInputStream("R13_FIO04_J.java")) {
            System.out.println("First byte: " + input.read());
        }

        System.out.println("Stream automatically closed.");
    }
}
