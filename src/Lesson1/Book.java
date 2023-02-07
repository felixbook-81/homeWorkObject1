package Lesson1;
import java.util.Objects;
public class Book {
    private String bookTitle;
    private Author author;
    int publication;

    public Book(String bookTitle, int publication, Author Author) {
        this.bookTitle = bookTitle;
        this.publication = publication;
        this.author = Author;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublication() {
        return this.publication;

    }

    public void setPublication(int publication) {
        // Создали сеттер — метод, который меняет значение
        this.publication = publication;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return publication == book.publication && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookTitle);
    }
}