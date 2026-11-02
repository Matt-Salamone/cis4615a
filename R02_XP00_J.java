
import java.io.File;

/**
 * Rule 02: Expressions (EXP)
 * EXP00-J: Do not ignore values returned by methods.
 *
 * Professor's filename: R02_XP00_J.java
 *
 * NONCOMPLIANT EXAMPLE:
 * The return value of File.delete() is ignored.
 */
public class R02_XP00_J {

    public static void main(String[] args) {

        // This file is deliberately missing for the demonstration.
        File someFile = new File("hw02-missing-directory/target.txt");

        // Safety check: never delete an existing file in this demo.
        if (someFile.exists()) {
            System.out.println("Demo skipped: target already exists.");
            return;
        }

        // Vulnerability: the boolean result is ignored.
        someFile.delete();

        // Incorrectly assumes that the deletion succeeded.
        System.out.println("File deleted successfully!");
    }
}
