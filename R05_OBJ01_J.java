/**
 * Rule 05: Object Orientation (OBJ)
 * OBJ01-J: Limit accessibility of fields.
 * COMPLIANT: Private field with validated methods.
 */
class InventoryCounter {
    private int total = 0;

    public int getTotal() {
        return total;
    }

    public void addItem() {
        if (total == Integer.MAX_VALUE) {
            throw new ArithmeticException("Counter overflow");
        }
        total++;
    }

    public void removeItem() {
        if (total <= 0) {
            throw new IllegalStateException("Inventory is empty");
        }
        total--;
    }
}

public class R05_OBJ01_J {
    public static void main(String[] args) {
        InventoryCounter inventory = new InventoryCounter();

        inventory.addItem();
        inventory.addItem();
        System.out.println("Initial items: " + inventory.getTotal());

        inventory.removeItem();
        inventory.removeItem();

        try {
            inventory.removeItem();
        } catch (IllegalStateException e) {
            System.out.println("Invalid removal rejected: " + e.getMessage());
        }

        System.out.println("Final items: " + inventory.getTotal());
        System.out.println("Invariant preserved: "
                + (inventory.getTotal() >= 0));
    }
}
