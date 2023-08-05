// FictionLibraryFactory.java
public class FictionLibraryFactory implements LibraryFactory {
    @Override
    public Book createBook() {
        return new FictionBook("The Great Gatsby");
    }

    @Override
    public Member createMember() {
        return new LibraryMember("Andi");
    }

    @Override
    public Loan createLoan(Book book, Member member) {
        return new Loan(book, member, "Fiction Loan");
    }
}
