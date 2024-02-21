package app;


/**
 * Concrete class that represents Book instance in the system.
 */
public class BookItem implements RITlibraryItem {
    /**
     * ISBN of this book object
     */
    public String ISBN;

    public BookItem(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public void accept(LibraryVisitor visitor) {
        visitor.visit(this);
    }
}
