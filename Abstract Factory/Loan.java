// Loan.java
public class Loan {
    private Book book;
    private Member member;
    private String type;

    public Loan(Book book, Member member, String type) {
        this.book = book;
        this.member = member;
        this.type = type;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public String getType() {
        return type;
    }
}
