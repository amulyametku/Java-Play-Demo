package dao;

import models.Book;

import java.util.Arrays;
import java.util.Collection;

public class FakeBookDoa implements BookDao{

    Book fakeBook = new Book(1,"FAKE BOOK");

    public Book create(Book book) {
        return fakeBook;
    }

    public Book read(Integer id) {
        return fakeBook;
    }

    public Book update(Book book) {
        return fakeBook;
    }

    public Book delete(Integer id) {
        return fakeBook;
    }
    public Collection<Book> all() {
        return Arrays.asList(fakeBook);
    }
}
