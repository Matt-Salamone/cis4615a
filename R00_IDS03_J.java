import java.util.logging.Logger;

/**
 * Rule 00: Input Validation and Data Sanitization (IDS)
 * IDS03-J: Do not log unsanitized user input.
 *
 * NONCOMPLIANT EXAMPLE:
 * User-controlled input is logged without sanitization.
 */
public class R00_IDS03_J {

    private static final Logger logger =
            Logger.getLogger(R00_IDS03_J.class.getName());

    public static void main(String[] args) {

        // Simulated malicious username containing a newline.
        String username = "guest\nSEVERE: User login succeeded for: administrator";

        // The actual login attempt failed.
        boolean loginSuccessful = false;

        // Vulnerability: username is logged without sanitization.
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}
