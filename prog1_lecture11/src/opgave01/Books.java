package opgave01;

public class Books {

    public static void main(String[] args) {
        // Constructor for new books
        Book book_1 = new Book("Coding_for_Dummies", "Emil", 1200);
        Book book_2 = new Book("Coding_for_Pros", "Emil", 950);

        // Printing book details to console
        System.out.println(book_1.title + ", " + book_1.author + ", " + book_1.pages);
        System.out.println(book_2.title + ", " + book_2.author + ", " + book_2.pages);
    }
}
