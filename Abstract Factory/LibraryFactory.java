// LibraryFactory.java
public interface LibraryFactory {
    Book createBook();
    Member createMember();
    Loan createLoan(Book book, Member member);
}
