class Book {
    int bookId;
    String bookTitle;
    String authorName;
    double price;

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book();

        b1.bookId = 101;
        b1.bookTitle = "Java Programming";
        b1.authorName = "James Gosling";
        b1.price = 500;

        b2.bookId = 102;
        b2.bookTitle = "Python Basics";
        b2.authorName = "Guido van Rossum";
        b2.price = 450;

        b1.display();
        b2.display();
    }
}