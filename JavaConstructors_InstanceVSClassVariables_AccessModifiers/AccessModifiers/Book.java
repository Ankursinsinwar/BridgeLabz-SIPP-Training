package AccessModifiers;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public void displayInfo() {
        System.out.println("ISBN (public): " + ISBN);
        System.out.println("Title (protected): " + title);
    }

    public static void main(String[] args) {
        EBook ebook = new EBook();
        ebook.ISBN = "123-456-789";
        ebook.title = "Learn Java";
        ebook.setAuthor("John Doe");

        ebook.displayInfo();
        System.out.println("Author (private via getter): " + ebook.getAuthor());
    }
}
