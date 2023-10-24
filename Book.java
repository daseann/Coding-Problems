public class Book {
    private String title;
    private String author;
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public boolean isThickerThan(Book otherBook) {
        return this.numberOfPages > otherBook.numberOfPages;
    }

    @Override
    public String toString() {
        return title + "\t" + author + "\t" + numberOfPages;
    }

    public static void main(String[] args) {
        // Create a new book object and print its details to the console
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 256);
        Book myBook2 = new Book("Holy Bible", "Various Authors", 2000); // Note: I've changed the author for accuracy
        
        System.out.println(myBook);
        System.out.println(myBook2);

        if (myBook.isThickerThan(myBook2)) {
            System.out.println(myBook.getTitle() + " has more pages than " + myBook2.getTitle());
        } else {
            System.out.println(myBook2.getTitle() + " has more pages than " + myBook.getTitle());
        }
    }
}
