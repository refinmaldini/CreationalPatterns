public class LibraryMember implements Member {
    private String name;

    public LibraryMember(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}