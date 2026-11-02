import java.io.FileInputStream;
import java.io.IOException;

/**
 * Rule 13: Input Output (FIO)
 * FIO04-J: Release resources when they are no longer needed.
 *
 * NONCOMPLIANT: FileInputStream is never closed.
 */
public class R13_FIO04_J {

    public static void main(String[] args) throws IOException {

        // Open this Java source file for reading.
        FileInputStream input = new FileInputStream("R13_FIO04_J.java");

        System.out.println("First byte: " + input.read());

        // Vulnerability: missing input.close().
        // The operating system resource is not explicitly released.
    }
}
