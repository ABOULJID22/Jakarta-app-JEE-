package com.example.service;

import com.example.dao.BookDAO;
import com.example.model.Book;
import java.util.List;

public class BookService {

    private BookDAO bookDAO = new BookDAO();

    public void addBook(Book book) {
        bookDAO.saveBook(book);
    }

    public List<Book> listBooks() {
        return bookDAO.getAllBooks();
    }

    public Book findBook(Long id) {
        return bookDAO.getBookById(id);
    }

    public void updateBook(Book book) {
        bookDAO.updateBook(book);
    }

    public void deleteBook(Long id) {
        bookDAO.deleteBook(id);
    }
}
