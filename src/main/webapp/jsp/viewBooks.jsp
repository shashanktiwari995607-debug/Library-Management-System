<%@ page import="java.util.*, com.lms.model.Book" %>
<%
    List<Book> books = (List<Book>) session.getAttribute("books");
%>

<!DOCTYPE html>
<html>
<head>
    <title>View Books</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="bg-light">

<div class="container mt-4">
    <h2>All Books</h2>

    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <th>ID</th><th>Title</th><th>Author</th>
                <th>ISBN</th><th>Total</th><th>Available</th>
            </tr>
        </thead>

        <tbody>
        <% if (books != null) {
            for (Book b : books) { %>
                <tr>
                    <td><%= b.getBookId() %></td>
                    <td><%= b.getTitle() %></td>
                    <td><%= b.getAuthor() %></td>
                    <td><%= b.getIsbn() %></td>
                    <td><%= b.getTotalCopies() %></td>
                    <td><%= b.getAvailableCopies() %></td>
                </tr>
        <%  }} %>
        </tbody>
    </table>

    <a href="dashboard.jsp" class="btn btn-secondary">Back</a>

</div>

</body>
</html>
