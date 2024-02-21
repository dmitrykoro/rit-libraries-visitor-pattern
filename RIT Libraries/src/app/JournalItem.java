package app;


/**
 * Concrete class that represents Journal instance in the system.
 */
public class JournalItem implements RITlibraryItem {
    /**
     * DOI of this journal object
     */
    public String DOI;

    /**
     * Create a new Journal
     * @param DOI of this journal
     */
    public JournalItem(String DOI) {
        this.DOI = DOI;
    }

    @Override
    public void accept(LibraryVisitor visitor) {
        visitor.visit(this);
    }
}
