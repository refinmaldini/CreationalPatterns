// FictionBook.java
public class FictionBook implements Book {
    private String title;

    public FictionBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
