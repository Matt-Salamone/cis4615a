
/**
 * Rule 06: Methods (MET)
 * MET01-J: Never use assertions to validate method arguments.
 *
 * NONCOMPLIANT EXAMPLE:
 * The method relies on assertions to reject invalid arguments.
 * Assertions are disabled by default in Java.
 */
public class R06_MET01_J {

    public static int getAbsAdd(int x, int y) {

        // Vulnerability: assertions are not reliable
        // for validating method arguments.
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;

        int absX = Math.abs(x);
        int absY = Math.abs(y);

        // Another assertion used to prevent integer overflow.
        assert (absX <= Integer.MAX_VALUE - absY);

        return absX + absY;
    }

    public static void main(String[] args) {

        // Deliberately use an invalid argument.
        int x = Integer.MIN_VALUE;
        int y = 1;

        System.out.println("Input x: " + x);
        System.out.println("Input y: " + y);

        // With assertions disabled, this returns
        // an incorrect negative result.
        int result = getAbsAdd(x, y);

        System.out.println("Result: " + result);
        System.out.println("Expected behavior: Reject invalid arguments");
    }
}
