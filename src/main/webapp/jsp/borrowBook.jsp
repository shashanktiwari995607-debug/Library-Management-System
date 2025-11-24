<!DOCTYPE html>
<html>
<head>
    <title>Borrow Book</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="bg-light">

<div class="container mt-4">
    <h2>Borrow Book</h2>

    <form action="../BorrowBookServlet" method="post">

        <div class="mb-3">
            <label>Book ID</label>
            <input type="number" name="bookId" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Member ID</label>
            <input type="number" name="memberId" class="form-control" required>
        </div>

        <% if (request.getParameter("success") != null) { %>
            <div class="alert alert-success">Book Borrowed!</div>
        <% } %>

        <button class="btn btn-primary">Borrow</button>

    </form>
</div>

</body>
</html>
