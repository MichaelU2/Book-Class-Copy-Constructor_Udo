/**
 * Book.java
 * A simple library record demonstrating a parameterized constructor,
 * a copy constructor, and a display method.
 */
public class Book {

    // Instance variables
    private String title;
    private String author;
    private int pages;

    // Parameterized constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Copy constructor: builds a new, independent Book from an existing one
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.pages = other.pages;
    }

    // Setters (used for the bonus)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Prints the book's details on one line
    public void display() {
        System.out.println(title + " by " + author + " (" + pages + " pages)");
    }
}