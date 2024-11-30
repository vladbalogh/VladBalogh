package Tema_2;

public class LibraryCatalog {
    Book book1;
    Book book2;
    Book book3;

    public void addBook(Book book) {
        if (book1 == null) {
            this.book1 = book;
            System.out.println("Added book1");
        }else if (book2 == null) {
            this.book2 = book;
            System.out.println("Added book2");
        }else if (book3 == null) {
            this.book3 = book;
            System.out.println("Added book3");
        }else {
            System.out.println("Library full");
        }
    }
    public void deleteBook(int book) {
        switch (book) {
            case 1: book1 = null;
                System.out.println("Book1 deleted");
                break;
            case 2: book2 = null;
                System.out.println("Book2 deleted");
                break;
            case 3: book3 = null;
                System.out.println("Book3 deleted");
                break;
            default:
                System.out.println("Book id " + book + " not found.");
        }

    }
    public void listBooks() {
        System.out.println("Listing all books: ");
        System.out.println("Book1:  " + book1);
        System.out.println("Book2:  " + book2);
        System.out.println("Book3:  " + book3);
    }
}
