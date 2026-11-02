import java.io.File;

/**
 * Rule 02: Expressions
 * EXP00-J: Do not ignore values returned by methods.
 * Professor's filename uses XP00 instead of EXP00.
 * COMPLIANT: Check the result of File.delete().
 */
public class R02_XP00_J {
    public static void main(String[] args) {
        File someFile = new File("hw02-missing-directory/target.txt");

        if (someFile.exists()) {
            System.out.println("Demo skipped: target already exists.");
            return;
        }

        if (someFile.delete()) {
            System.out.println("File deleted successfully!");
        } else {
            System.out.println("Deletion failed or target does not exist.");
        }
    }
}
