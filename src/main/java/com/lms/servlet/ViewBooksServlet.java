package com.lms.servlet;

import com.lms.dao.BookDAO;
import com.lms.dao.impl.BookDAOImpl;
import com.lms.model.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ViewBooksServlet extends HttpServlet {

    private BookDAO bookDAO = new BookDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        List<Book> books = bookDAO.getAllBooks();
        request.getSession().setAttribute("books", books);

        response.sendRedirect("jsp/viewBooks.jsp");
    }
}
