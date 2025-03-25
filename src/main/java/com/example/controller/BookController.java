package com.example.controller;

import com.example.model.Book;
import com.example.service.BookService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class BookController extends HttpServlet {

    private BookService bookService = new BookService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null) {
            if (action.equals("edit")) {
                Long id = Long.parseLong(request.getParameter("id"));
                Book book = bookService.findBook(id);
                request.setAttribute("book", book);
                request.getRequestDispatcher("/book/edit.jsp").forward(request, response);
            } else if (action.equals("delete")) {
                Long id = Long.parseLong(request.getParameter("id"));
                bookService.deleteBook(id);
                response.sendRedirect("/book/list");
            }
        } else {
            List<Book> books = bookService.listBooks();
            request.setAttribute("books", books);
            request.getRequestDispatcher("/book/list.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String description = request.getParameter("description");

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setDescription(description);

        bookService.addBook(book);

        response.sendRedirect("/book/list");
    }
}
