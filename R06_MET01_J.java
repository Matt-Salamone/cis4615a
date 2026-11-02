/**
 * Rule 06: Methods
 * MET01-J: Never use assertions to validate method arguments.
 * COMPLIANT: Explicit validation and exceptions.
 */
public class R06_MET01_J {
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(
                    "Integer.MIN_VALUE is not supported");
        }

        int absX = Math.abs(x);
        int absY = Math.abs(y);

        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException(
                    "Sum would overflow");
        }

        return absX + absY;
    }

    public static void main(String[] args) {
        int x = Integer.MIN_VALUE;
        int y = 1;

        System.out.println("Input x: " + x);
        System.out.println("Input y: " + y);

        try {
            System.out.println("Result: " + getAbsAdd(x, y));
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected invalid arguments: "
                    + e.getMessage());
        }
    }
}
