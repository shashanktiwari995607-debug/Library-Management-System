<!DOCTYPE html>
<html>
<head>
    <title>Return Book</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="bg-light">

<div class="container mt-4">
    <h2>Return Book</h2>

    <form action="../ReturnBookServlet" method="post">

        <div class="mb-3">
            <label>Transaction ID</label>
            <input type="number" name="txnId" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Book ID</label>
            <input type="number" name="bookId" class="form-control" required>
        </div>

        <% if (request.getParameter("success") != null) { %>
            <div class="alert alert-success">Book Returned!</div>
        <% } %>

        <button class="btn btn-secondary">Return Book</button>

    </form>
</div>

</body>
</html>
