public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book(1, "Java Basics", "James Gosling");
        Book b2 = new Book(2, "Effective Java", "Joshua Bloch");
        library.addBook(b1);
        library.addBook(b2);

        User u1 = new User(1, "Sahithi");
        library.registerUser(u1);

        library.borrowBook(1, 1); // Sahithi borrows Java Basics
        library.listAllBooks();

        u1.listBorrowedBooks();

        library.returnBook(1, 1); // Sahithi returns Java Basics
        library.listAllBooks();
    }
}

