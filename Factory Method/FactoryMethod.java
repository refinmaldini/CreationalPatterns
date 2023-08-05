public class FactoryMethod {
    public static void main(String[] args) {
        Loan fictionLoan = new FictionLoan();
        Book fictionBook = fictionLoan.createBook();
        Member fictionMember = fictionLoan.createMember();

        Loan nonFictionLoan = new NonFictionLoan();
        Book nonFictionBook = nonFictionLoan.createBook();
        Member nonFictionMember = nonFictionLoan.createMember();

        System.out.println("Fiction Loan - Book: " + fictionBook.getTitle() + ", Member: " + fictionMember.getName());
        System.out.println("Non-Fiction Loan - Book: " + nonFictionBook.getTitle() + ", Member: " + nonFictionMember.getName());
    }
}
