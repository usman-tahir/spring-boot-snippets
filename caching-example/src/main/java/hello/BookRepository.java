package hello;

public interface BookRepository {
    Book getBookByIsbn(String isbn);
}