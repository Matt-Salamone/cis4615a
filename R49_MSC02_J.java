import java.util.Random;

/**
 * Rule 49: Miscellaneous (MSC)
 * MSC02-J: Generate strong random numbers.
 *
 * NONCOMPLIANT: Predictable Random is used for
 * simulated security-sensitive verification codes.
 */
public class R49_MSC02_J {

    public static void main(String[] args) {

        // Vulnerability: fixed-seed Random is predictable.
        Random generator1 = new Random(123L);
        Random generator2 = new Random(123L);

        int code1 = generator1.nextInt(1_000_000);
        int code2 = generator2.nextInt(1_000_000);

        System.out.println("First verification code: " + code1);
        System.out.println("Second verification code: " + code2);
        System.out.println("Codes match: " + (code1 == code2));
    }
}
