import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/**
 * Rule 04: Characters and Strings
 * STR03-J: Do not encode noncharacter data as a string.
 * COMPLIANT: Convert numbers to valid decimal text.
 */
public class R04_STR03_J {
    public static void main(String[] args) {
        BigInteger original = new BigInteger("530500452766");

        String text = original.toString();
        byte[] encoded = text.getBytes(StandardCharsets.UTF_8);
        String decoded = new String(encoded, StandardCharsets.UTF_8);
        BigInteger recovered = new BigInteger(decoded);

        System.out.println("Original value: " + original);
        System.out.println("Recovered value: " + recovered);
        System.out.println("Values match: "
                + original.equals(recovered));
    }
}
