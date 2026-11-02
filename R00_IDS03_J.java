import java.util.logging.Logger;

/**
 * Rule 00: Input Validation and Data Sanitization
 * IDS03-J: Do not log unsanitized user input.
 * COMPLIANT: Validate usernames before logging.
 */
public class R00_IDS03_J {
    private static final Logger logger =
            Logger.getLogger(R00_IDS03_J.class.getName());

    private static String sanitizeUser(String username) {
        return username.matches("[A-Za-z0-9]+")
                ? username : "unauthorized user";
    }

    public static void main(String[] args) {
        String username =
                "guest\nSEVERE: User login succeeded for: administrator";
        boolean loginSuccessful = false;

        if (loginSuccessful) {
            logger.severe("User login succeeded for: "
                    + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: "
                    + sanitizeUser(username));
        }
    }
}
