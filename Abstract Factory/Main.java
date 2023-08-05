// Main.java
public class Main {
    public static void main(String[] args) {
        LibraryFactory fictionFactory = new FictionLibraryFactory();
        Book fictionBook = fictionFactory.createBook();
        Member fictionMember = fictionFactory.createMember();
        Loan fictionLoan = fictionFactory.createLoan(fictionBook, fictionMember);

        LibraryFactory nonFictionFactory = new NonFictionLibraryFactory();
        Book nonFictionBook = nonFictionFactory.createBook();
        Member nonFictionMember = nonFictionFactory.createMember();
        Loan nonFictionLoan = nonFictionFactory.createLoan(nonFictionBook, nonFictionMember);

        System.out.println("Fiction Loan - Book: " + fictionBook.getTitle() + ", Member: " + fictionMember.getName() + ", Type: " + fictionLoan.getType());
        System.out.println("Non-Fiction Loan - Book: " + nonFictionBook.getTitle() + ", Member: " + nonFictionMember.getName() + ", Type: " + nonFictionLoan.getType());
    }
}
