package com.example.dao;

import com.example.model.Book;
/* import com.example.util.DBUtil;
 */
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class BookDAO {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-pu");

    public void saveBook(Book book) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<Book> getAllBooks() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Book> books = entityManager.createQuery("FROM Book", Book.class).getResultList();
        entityManager.close();
        return books;
    }

    public Book getBookById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Book book = entityManager.find(Book.class, id);
        entityManager.close();
        return book;
    }

    public void updateBook(Book book) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(book);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void deleteBook(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Book book = entityManager.find(Book.class, id);
        if (book != null) {
            entityManager.remove(book);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
