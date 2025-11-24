package com.lms.servlet;

import com.lms.dao.BookDAO;
import com.lms.dao.impl.BookDAOImpl;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

public class DeleteBookServlet extends HttpServlet {

    private BookDAO bookDAO = new BookDAOImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int bookId = Integer.parseInt(request.getParameter("bookId"));
        bookDAO.deleteBook(bookId);

        response.sendRedirect("jsp/viewBooks.jsp");
    }
}
