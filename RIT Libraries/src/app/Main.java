package app;


/**
 * The class for the testing purposes.
 */
public class Main {
    public static void main(String[] args) {

        // create instances of library inventory
        RITlibraryItem book = new BookItem("978-3-16-148410-0");
        RITlibraryItem laptop = new LaptopItem("998372829");
        RITlibraryItem journal = new JournalItem("http://dx.doi.org/10.1093/ajae/aaq063");

        // create a visitor
        LibraryVisitor libraryVisitor = new ConcreteLibraryVisitor();

        // visit instances
        book.accept(libraryVisitor);
        laptop.accept(libraryVisitor);
        journal.accept(libraryVisitor);
    }
}
