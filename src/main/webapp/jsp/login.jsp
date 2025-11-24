<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login - Library Management System</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-4">

            <div class="card shadow-lg">
                <div class="card-header text-center bg-primary text-white">
                    <h4>Library Login</h4>
                </div>

                <div class="card-body">

                    <form action="../LoginServlet" method="post">

                        <div class="mb-3">
                            <label>Email</label>
                            <input type="email" name="email" required class="form-control">
                        </div>

                        <div class="mb-3">
                            <label>Password</label>
                            <input type="password" name="password" required class="form-control">
                        </div>

                        <% if (request.getParameter("error") != null) { %>
                            <div class="alert alert-danger">Invalid Credentials!</div>
                        <% } %>

                        <button class="btn btn-primary w-100">Login</button>

                    </form>

                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>
