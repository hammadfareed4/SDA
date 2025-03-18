// Creator: Defines how a book is created
class Book {
    String title;
    String author;

    // Constructor (acts as a creator)
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

public class CreatorPrincipleExample {
    public static void main(String[] args) {
        Book myBook = new Book("The Art of Thinking", "John Doe"); // Book is created with a defined structure
        myBook.display();
    }
}
