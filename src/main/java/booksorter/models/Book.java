package booksorter.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class Book implements Comparable<Book> {
    private int id;
    private String name;
    private int pageLength;
    private String author;
    private int year;

    public static int lastID = -1;

    public Book(String name, int pageLength, String author, int year) {
        this.id = ++lastID;
        this.name = name;
        this.pageLength = pageLength;
        this.author = author;
        this.year = year;
    }

    @Override
    public int compareTo(Book b) {
        return name.compareTo(b.getName());
    }
}
