
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/**
 * Rule 04: Characters and Strings (STR)
 * STR03-J: Do not encode noncharacter data as a string.
 *
 * NONCOMPLIANT EXAMPLE:
 * Arbitrary binary data is converted into a String,
 * causing the original data to become corrupted.
 */
public class R04_STR03_J {

    public static void main(String[] args) {

        // Original number from the professor's example.
        BigInteger x = new BigInteger("530500452766");

        // Remember the original value for comparison.
        BigInteger original = x;

        // Convert the number into raw binary data.
        byte[] byteArray = x.toByteArray();

        // Vulnerability: interpret arbitrary binary data as text.
        String s = new String(byteArray, StandardCharsets.UTF_8);

        // Convert the text back into binary data.
        byteArray = s.getBytes(StandardCharsets.UTF_8);

        // Attempt to reconstruct the original number.
        x = new BigInteger(byteArray);

        System.out.println("Original value: " + original);
        System.out.println("Recovered value: " + x);
        System.out.println("Values match: " + original.equals(x));
    }
}
