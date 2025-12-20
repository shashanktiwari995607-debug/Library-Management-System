package com.lms.servlet;

import com.lms.dao.BookDAO;
import com.lms.dao.TransactionDAO;
import com.lms.dao.impl.BookDAOImpl;
import com.lms.dao.impl.TransactionDAOImpl;
import com.lms.model.TransactionRecord;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.sql.Date;

public class BorrowBookServlet extends HttpServlet {

    private TransactionDAO txnDAO = new TransactionDAOImpl();
    private BookDAO bookDAO = new BookDAOImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int bookId = Integer.parseInt(request.getParameter("bookId"));
        int memberId = Integer.parseInt(request.getParameter("memberId"));
        if (bookId <= 0 || memberId <= 0) {
        response.sendRedirect("jsp/borrowBook.jsp?error=invalid");
        return;
    }
        Date borrow = new Date(System.currentTimeMillis());
        Date due = Date.valueOf(borrow.toLocalDate().plusDays(7));

        TransactionRecord tr = new TransactionRecord(0, bookId, memberId, borrow, due, null, "BORROWED");

        txnDAO.borrowBook(tr);

        // Update book copies
        var book = bookDAO.getBookById(bookId);
        book.setAvailableCopies(book.getAvailableCopies() - 1);
        bookDAO.updateBook(book);

        response.sendRedirect("jsp/borrowBook.jsp?success=true");
    }
}
