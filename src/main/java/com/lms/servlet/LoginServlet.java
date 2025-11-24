package com.lms.servlet;

import com.lms.dao.MemberDAO;
import com.lms.dao.impl.MemberDAOImpl;
import com.lms.model.Member;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private MemberDAO memberDAO = new MemberDAOImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String email = request.getParameter("email");
        String pass = request.getParameter("password");

        Member m = memberDAO.getMemberByEmail(email);

        if (m != null && m.getPassword().equals(pass)) {

            request.getSession().setAttribute("member", m);
            response.sendRedirect("jsp/dashboard.jsp");

        } else {
            response.sendRedirect("jsp/login.jsp?error=true");
        }
    }
}
