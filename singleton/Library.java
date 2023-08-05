import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> books;
    private List<Member> members;
    private List<Loan> loans;

    private Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public List<Member> getMembers() {
        return members;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public static void main(String[] args) {
        Library library = Library.getInstance();

        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("Pride and Prejudice");

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Andi");
        Member member2 = new Member("John");

        library.addMember(member1);
        library.addMember(member2);

        Loan loan1 = new Loan(book1, member1);
        Loan loan2 = new Loan(book2, member2);

        library.addLoan(loan1);
        library.addLoan(loan2);

        List<Loan> loansInLibrary = library.getLoans();
        for (Loan loan : loansInLibrary) {
            System.out.println("Loan - Book: " + loan.getBook().getTitle() + ", Member: " + loan.getMember().getName());
        }
    }
}
