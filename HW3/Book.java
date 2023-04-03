package HW3;

public class Book {
    public int isbn;
    String name;
    Author author;
    Publisher publisher;
    int publicationDate;
    boolean paperback;

    public String toString() {
        return "Book{isbn='" + isbn + "', name=" + name + ", author=" + author + ", publisher=" + publisher + ", PublicationDate=" + publicationDate + ", paperback=" + paperback + '}';
    }

    Book() {
    }

    Book(int isbn, String name) {
        this.isbn = isbn;
        this.name = name;
    }

    Book(int isbn, String name, Author author) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
    }

    public Book(int isbn, String name, Author author, Publisher publisher, int publicationDate) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    Book(int isbn, String name, Author author, Publisher publisher, int publicationDate, boolean paperback) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.paperback = paperback;
    }

    Book(int isbn, String name, Author author, Publisher publisher) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    public void setISBN(int ISBN) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(HW3.Author author) {
        this.author = author;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setPaperback(boolean paperback) {
        this.paperback = paperback;
    }

    public int getISBN() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public boolean getPaperback() {
        return paperback;
    }
}
