package com.lms.servlet;

import com.lms.dao.BookDAO;
import com.lms.dao.impl.BookDAOImpl;
import com.lms.model.Book;

import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class SearchBookServlet extends HttpServlet {

    private BookDAO bookDAO = new BookDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String keyword = request.getParameter("keyword");

        if (keyword == null || keyword.trim().isEmpty()) {
            response.sendRedirect("jsp/viewBooks.jsp");
            return;
        }

        List<Book> books = bookDAO.getAllBooks();

        List<Book> result = books.stream()
                .filter(b -> b.getTitle().toLowerCase().contains(keyword.toLowerCase())
                          || b.getAuthor().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());

        request.getSession().setAttribute("books", result);
        response.sendRedirect("jsp/viewBooks.jsp");
    }
}

