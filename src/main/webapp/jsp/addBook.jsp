<!DOCTYPE html>
<html>
<head>
    <title>Add Book</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="bg-light">

<div class="container mt-4">
    <h2>Add Book</h2>

    <form action="../AddBookServlet" method="post">

        <div class="mb-3">
            <label>Title</label>
            <input type="text" name="title" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Author</label>
            <input type="text" name="author" class="form-control">
        </div>

        <div class="mb-3">
            <label>ISBN</label>
            <input type="text" name="isbn" class="form-control">
        </div>

        <div class="mb-3">
            <label>Total Copies</label>
            <input type="number" name="totalCopies" class="form-control" required>
        </div>

        <% if (request.getParameter("success") != null) { %>
            <div class="alert alert-success">Book Added Successfully!</div>
        <% } %>

        <button class="btn btn-success">Add Book</button>

    </form>
</div>

</body>
</html>
