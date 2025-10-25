public class Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static{
        totalNoOfBooks = 0;
    }
    { //Object Init
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNumberOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if(isBorrowed) {
            System.out.println("Book is Already Borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }
    void returnBook() {
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope You Enjoyed, Please leave a review");
        } else {
            System.out.println("This book is already in library");
        }
    }

    public static void main(String[] args) {
        Book desighnOfThings = new Book("1", "Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNumberOfBooks());
        desighnOfThings.borrowBook();
        myBook.borrowBook();
        desighnOfThings.borrowBook();
        desighnOfThings.returnBook();
        desighnOfThings.returnBook();
    }
}
