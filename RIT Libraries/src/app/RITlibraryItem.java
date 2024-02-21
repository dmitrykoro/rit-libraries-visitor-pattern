package app;

/**
 * Interface for RIT library items.
 */
public interface RITlibraryItem {

    /**
     * Accept a visitor of this item
     * @param visitor instance of the visitor
     */
    void accept(LibraryVisitor visitor);
}
