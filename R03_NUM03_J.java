import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * Rule 03: Numeric Types and Operations
 * NUM03-J: Use types that represent the full unsigned range.
 * COMPLIANT: Convert unsigned 32-bit data to long.
 */
public class R03_NUM03_J {
    public static long getInteger(DataInputStream is)
            throws IOException {
        return is.readInt() & 0xFFFFFFFFL;
    }

    public static void main(String[] args) throws IOException {
        byte[] data = {
            (byte) 0xFF, (byte) 0xFF,
            (byte) 0xFF, (byte) 0xFF
        };

        try (DataInputStream input = new DataInputStream(
                new ByteArrayInputStream(data))) {
            long result = getInteger(input);
            System.out.println("Read value: " + result);
            System.out.println("Expected unsigned value: 4294967295");
        }
    }
}
