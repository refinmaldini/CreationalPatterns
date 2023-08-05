public class FictionLoan implements Loan {
    @Override
    public Book createBook() {
        return new FictionBook("Fiction Book");
    }

    @Override
    public Member createMember() {
        return new LibraryMember("Fiction Member");
    }
}