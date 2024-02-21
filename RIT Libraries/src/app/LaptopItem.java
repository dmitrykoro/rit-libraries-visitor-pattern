package app;


/**
 * Concrete class that represents Laptop instance in the system.
 */
public class LaptopItem implements RITlibraryItem {
    /**
     * Serial of this Laptop object
     */
    public String serialNumber;

    /**
     * Create a new Laptop instance
     * @param id ID of the laptop
     */
    public LaptopItem(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void accept(LibraryVisitor visitor) {
        visitor.visit(this);
    }
}
