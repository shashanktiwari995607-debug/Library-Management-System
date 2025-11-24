<%@ page import="com.lms.model.Member" %>
<%
    Member m = (Member) session.getAttribute("member");
    if (m == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard - Library System</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="bg-light">

<nav class="navbar navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand">Library Dashboard</a>
        <span class="text-white">Welcome, <%= m.getName() %></span>
    </div>
</nav>

<div class="container mt-4">

    <div class="row">

        <div class="col-md-4 mb-3">
            <a href="addBook.jsp" class="btn btn-success w-100 p-3">Add Book</a>
        </div>

        <div class="col-md-4 mb-3">
            <a href="../ViewBooksServlet" class="btn btn-warning w-100 p-3">View Books</a>
        </div>

        <div class="col-md-4 mb-3">
            <a href="borrowBook.jsp" class="btn btn-info w-100 p-3">Borrow Book</a>
        </div>

        <div class="col-md-4 mb-3">
            <a href="returnBook.jsp" class="btn btn-secondary w-100 p-3">Return Book</a>
        </div>

    </div>

</div>

</body>
</html>
