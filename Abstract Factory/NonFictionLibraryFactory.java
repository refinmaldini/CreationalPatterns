// NonFictionLibraryFactory.java
public class NonFictionLibraryFactory implements LibraryFactory {
    @Override
    public Book createBook() {
        return new NonFictionBook("Jhon");
    }

    @Override
    public Member createMember() {
        return new LibraryMember("Pride and Prejudice");
    }

    @Override
    public Loan createLoan(Book book, Member member) {
        return new Loan(book, member, "Non-Fiction Loan");
    }
}
