package com.lms.servlet;

import com.lms.dao.BookDAO;
import com.lms.dao.TransactionDAO;
import com.lms.dao.impl.BookDAOImpl;
import com.lms.dao.impl.TransactionDAOImpl;
import com.lms.model.Book;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

public class ReturnBookServlet extends HttpServlet {

    private TransactionDAO txnDAO = new TransactionDAOImpl();
    private BookDAO bookDAO = new BookDAOImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int txnId = Integer.parseInt(request.getParameter("txnId"));
        int bookId = Integer.parseInt(request.getParameter("bookId"));

        txnDAO.returnBook(txnId);

        Book book = bookDAO.getBookById(bookId);
        book.setAvailableCopies(book.getAvailableCopies() + 1);
        bookDAO.updateBook(book);

        response.sendRedirect("jsp/returnBook.jsp?success=true");
    }
}
