package app;


/**
 * Interface for library visitor.
 */
public interface LibraryVisitor {

    void visit(BookItem bookItem);

    void visit(LaptopItem laptopItem);

    void visit(JournalItem JournalItem);
}
