package HW3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1234, "Bas", new Author(8132, "James", "Hetfield"), new Publisher(9111, "Kemal", "Izmir"), 1920, true),
                new Book(5364563, "Dijsktra", new Author(6456462, "Naz", "Tekinalp"), new Publisher(7474, "Recaizade", "Ankara"), 2023, true),
                new Book(232423434, "Red Orange", new Author(233, "Mick", "Jagger"), new Publisher(42424, "Mahmut", "Istanbul"), 1071, true),
                new Book(1111, "Hannibal Lecter", new Author(1755, "Ilyas", "Akin"), new Publisher(3333, "Ekrem", "Rize"), 1269, false),
                new Book(98642, "Usdagul", new Author(99666, "Taylor", "Swift"), new Publisher(3167, "Abdulhamit", "Van"), 1999, false),

        };
        filterByISBN(books, 1234);
        System.out.println(filterByISBN(books, 1234));
    }

    public static ArrayList<Book> filterByISBN(Book[] books, int value) {
        ArrayList<Book> booksToReturn = new ArrayList<Book>();

        for (Book book : books) {
            if (book.isbn == value) {
                booksToReturn.add(0, book);
            }
        }
        return booksToReturn;
    }
}
