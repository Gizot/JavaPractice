public class Book {
    private String name;
    private int pageNumber;

    Book(String name, int pageNumber) {
        this.name = name;
        this.pageNumber = pageNumber;
    }

    public String showName() {
        return this.name;
    }

    public void changeName() {
        this.name = name;

    }

    public int showPageNumber() {
        return this.pageNumber;
    }

    public int changeNumber() {
        if (pageNumber < 0) {
            pageNumber = 0;
        } else {
            this.pageNumber = pageNumber;

        }
          return pageNumber;
    }

}
