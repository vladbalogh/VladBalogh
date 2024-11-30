package Tema_2;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        Book book1 = new Novel("Ion", 400, "poveste");
        Book book2 = new ArtAlbum("DaVinci", 200, "good");
        Book book3 = new Novel("Morometii", 150, "poveste");

        catalog.addBook(book1);
        catalog.listBooks();
        catalog.addBook(book2);
        catalog.addBook(book3);
        catalog.listBooks();
        catalog.deleteBook(2);
        catalog.deleteBook(5);
        catalog.listBooks();

    }
}
