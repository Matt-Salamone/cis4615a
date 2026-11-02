import java.security.SecureRandom;

/**
 * Rule 49: Miscellaneous (MSC)
 * MSC02-J: Generate strong random numbers.
 * COMPLIANT: Use SecureRandom for simulated security codes.
 */
public class R49_MSC02_J {
    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        int code1 = generator.nextInt(1_000_000);
        int code2 = generator.nextInt(1_000_000);

        System.out.printf("First demo code: %06d%n", code1);
        System.out.printf("Second demo code: %06d%n", code2);
        System.out.println("Generator: SecureRandom");
    }
}
