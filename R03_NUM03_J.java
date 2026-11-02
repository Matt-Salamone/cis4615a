
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * Rule 03: Numeric Types and Operations (NUM)
 * NUM03-J: Use integer types that can fully represent
 * the possible range of unsigned data.
 *
 * NONCOMPLIANT EXAMPLE:
 * An unsigned 32-bit value is read into a signed int.
 */
public class R03_NUM03_J {

    // Vulnerability: int cannot represent every unsigned 32-bit value.
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();
    }

    public static void main(String[] args) throws IOException {

        // Four bytes containing all 1 bits (0xFFFFFFFF).
        byte[] data = {
            (byte) 0xFF,
            (byte) 0xFF,
            (byte) 0xFF,
            (byte) 0xFF
        };

        // Simulate reading binary data from an external source.
        ByteArrayInputStream byteStream = new ByteArrayInputStream(data);
        DataInputStream input = new DataInputStream(byteStream);

        // Read the unsigned data using the vulnerable method.
        int result = getInteger(input);

        System.out.println("Read value: " + result);
        System.out.println("Expected unsigned value: 4294967295");

        input.close();
    }
}
