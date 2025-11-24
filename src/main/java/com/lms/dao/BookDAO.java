package com.lms.dao;

import com.lms.model.Book;
import java.util.List;

public interface BookDAO {
    boolean addBook(Book book);
    boolean updateBook(Book book);
    boolean deleteBook(int bookId);
    Book getBookById(int bookId);
    List<Book> getAllBooks();
}
