public class NonFictionLoan implements Loan {
    @Override
    public Book createBook() {
        return new NonFictionBook("Non-Fiction Book");
    }

    @Override
    public Member createMember() {
        return new LibraryMember("Non-Fiction Member");
    }
}
