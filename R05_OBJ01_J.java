
/**
 * Rule 05: Object Orientation (OBJ)
 * OBJ01-J: Limit accessibility of fields.
 *
 * NONCOMPLIANT EXAMPLE:
 * A public field allows external code to bypass
 * validation and violate a class invariant.
 */

// A simple inventory counter.
class InventoryCounter {

    // Vulnerability: this field is publicly accessible.
    public int total = 0;

    public void addItem() {
        if (total == Integer.MAX_VALUE) {
            throw new ArithmeticException("Counter overflow");
        }

        total++;
    }

    public void removeItem() {
        if (total > 0) {
            total--;
        } else {
            throw new IllegalStateException(
                "Cannot remove an item from an empty inventory"
            );
        }
    }
}

public class R05_OBJ01_J {

    public static void main(String[] args) {

        InventoryCounter inventory = new InventoryCounter();

        // Normal operations preserve the invariant.
        inventory.addItem();
        inventory.addItem();

        System.out.println(
            "Items after normal operations: " + inventory.total
        );

        // Vulnerability: external code directly changes the field.
        // This bypasses the validation methods entirely.
        inventory.total = -50;

        System.out.println(
            "Items after direct field tampering: " + inventory.total
        );

        // The invariant requires total >= 0.
        System.out.println(
            "Invariant preserved: " + (inventory.total >= 0)
        );
    }
}
