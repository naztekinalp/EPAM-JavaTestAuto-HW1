package HW3;

public class Book {
    public int ISBN;
    String name;
    Author Author;
    Publisher Publisher;
    int PublicationDate;
    boolean Paperback;

    public String toString() {
        return "Book{ISBN='" + ISBN + "', Name=" + Name + ", Author=" + Author + ", Publisher=" + Publisher + ", PublicationDate=" + PublicationDate + ", Paperback=" + Paperback + '}';
    }

    Book() {
    }

    Book(int ISBN, String Name) {
        this.ISBN = ISBN;
        this.name = name;
    }

    Book(int ISBN, String Name, Author Author) {
        this.ISBN = ISBN;
        this.Name = Name;
        this.Author = Author;
    }

    public Book(int ISBN, String Name, Author Author, Publisher Publisher, int PublicationDate) {
        this.ISBN = ISBN;
        this.Name = Name;
        this.Author = Author;
        this.Publisher = Publisher;
        this.PublicationDate = PublicationDate;
    }

    Book(int ISBN, String Name, Author Author, Publisher Publisher, int PublicationDate, boolean Paperback) {
        this.ISBN = ISBN;
        this.Name = Name;
        this.Author = Author;
        this.Publisher = Publisher;
        this.PublicationDate = PublicationDate;
        this.Paperback = Paperback;
    }

    Book(int ISBN, String Name, Author Author, Publisher Publisher) {
        this.ISBN = ISBN;
        this.Name = Name;
        this.Author = Author;
        this.Publisher = Publisher;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAuthor(HW3.Author author) {
        this.Author = author;
    }

    public void setPublisher(Publisher publisher) {
        this.Publisher = publisher;
    }

    public void setPublicationDate(int publicationDate) {
        this.PublicationDate = publicationDate;
    }

    public void setPaperback(boolean paperback) {
        this.Paperback = paperback;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getName() {
        return Name;
    }

    public Author getAuthor() {
        return Author;
    }

    public Publisher getPublisher() {
        return Publisher;
    }

    public int getPublicationDate() {
        return PublicationDate;
    }

    public boolean getPaperback() {
        return Paperback;
    }
}
