package app;


/**
 * Concrete visitor class.
 */
public class ConcreteLibraryVisitor implements LibraryVisitor {
    @Override
    public void visit(BookItem bookItem) {
        System.out.println("Visiting Book. ISBN: " + bookItem.ISBN);
    }

    @Override
    public void visit(LaptopItem laptopItem) {
        System.out.println("Visiting Laptop. Serial number: " + laptopItem.serialNumber);
    }

    @Override
    public void visit(JournalItem journalItem) {
        System.out.println("Visiting Journal. DOI: " + journalItem.DOI);
    }
}
