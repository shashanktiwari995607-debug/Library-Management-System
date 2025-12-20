package com.lms.servlet;

import com.lms.dao.BookDAO;
import com.lms.dao.impl.BookDAOImpl;
import com.lms.model.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddBookServlet extends HttpServlet {

    private BookDAO bookDAO = new BookDAOImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       


        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");
        int total = Integer.parseInt(request.getParameter("totalCopies"));
         if (title == null || title.trim().isEmpty()
        || author == null || author.trim().isEmpty()
        || isbn == null || isbn.trim().isEmpty()
        || total <= 0) {

    response.sendRedirect("jsp/addBook.jsp?error=invalid");
    return;
}

        Book book = new Book(0, title, author, isbn, total, total);
        bookDAO.addBook(book);

        response.sendRedirect("jsp/addBook.jsp?success=true");
    }
}
