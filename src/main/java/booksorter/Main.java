package booksorter;

import booksorter.models.Book;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();

        books.add(new Book("The House of Mirth", 100, "Edith Wharton", 1905));
        books.add(new Book("East of Eden", 120, "John Steinbeck", 1952));
        books.add(new Book("Brave New World", 130, "Aldous Huxley", 1910));
        books.add(new Book("Pale Fire", 145, "Vladımır Nabokov", 1980));
        books.add(new Book("In Cold Blood", 300, "Truman Capote", 1990));

        Set<Book> sortedBooks = new TreeSet<>(Comparator.comparingInt(Book::getPageLength).reversed());

        sortedBooks.addAll(books);

        System.out.println("----Alphabetical Order ASCENDING ----");
        for (Book b : books) {
            System.out.printf("%d-%s Page Length: %d, Author: %s, Year: %d\n",
                    b.getId(), b.getName(), b.getPageLength(), b.getAuthor(), b.getYear());
        }

        System.out.println("----Order of Page Number DESCENDING ----");
        for (Book b : sortedBooks) {
            System.out.printf("%d-%s Page Length: %d, Author: %s, Year: %d\n",
                    b.getId(), b.getName(), b.getPageLength(), b.getAuthor(), b.getYear());
        }
    }
}
