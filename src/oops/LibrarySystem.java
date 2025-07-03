package oops;

class LibrarySystem {
    private String[] books = {"Java", "Python", "C++"};
    private boolean[] issued = {false, false, false};

    public void issueBook(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(bookName) && !issued[i]) {
                issued[i] = true;
                System.out.println(bookName + " issued successfully.");
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(bookName) && issued[i]) {
                issued[i] = false;
                System.out.println(bookName + " returned successfully.");
                return;
            }
        }
        System.out.println("Invalid return request.");
    }

    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < books.length; i++) {
            if (!issued[i])
                System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        library.showAvailableBooks();
        library.issueBook("Java");
        library.showAvailableBooks();
        library.returnBook("Java");
        library.showAvailableBooks();
    }
}
