package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import dao.BookDao;
import dao.FakeBookDoa;
import models.Book;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.Collection;


public class BooksController extends Controller {

    final BookDao bookDao;

    @Inject
    public BooksController(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Transactional
    public Result createBook() {

        final JsonNode json = request().body().asJson();

        final Book book = Json.fromJson(json, Book.class);

        Logger.debug("book title: " + book.getTitle());

        final Book finalBook  = bookDao.create(book);

        final JsonNode result = Json.toJson(finalBook);

        return ok(result);
    }


    @Transactional
    public Result getBookById(Integer id) {

        if (null == id) {
            return badRequest("ID not correct");
        }

        final Book finalBook = bookDao.read(id);

        if (null == finalBook) {
            return notFound();
        }

        final JsonNode result = Json.toJson(finalBook);

        return ok(result);
    }


    @Transactional
    public Result updateBookById(Integer id) {

        if (null == id) {
            return badRequest("ID not correct");
        }

        final JsonNode json = request().body().asJson();
        final Book newBook = Json.fromJson(json, Book.class);

        final Book finalBook = bookDao.update(newBook);

        final JsonNode result = Json.toJson(finalBook);

        return ok(result);
    }


    @Transactional
    public Result deleteBookById(Integer id) {
        if (null == id) {
            return notFound("Book not found");
        }

        final Book finalBook = bookDao.delete(id);

        if (null == finalBook) {
            return notFound();
        }

        final JsonNode result = Json.toJson(finalBook);
        return ok(result);
    }

    @Transactional
    public Result getAllBooks() {

        final Collection<Book> books = bookDao.all();
        final JsonNode result = Json.toJson(books);

        return ok(result);
    }
}
