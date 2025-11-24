📚 Library Management System – Web Based (JSP + Servlets + JDBC)

A complete web-based Library Management System developed using Java Servlets, JSP, JDBC, and MySQL.
This project demonstrates proper MVC architecture, OOP principles, database integration, and servlet-based web workflow.

🏛 About the Project

This Library Management System allows librarians to manage books, members, and book transactions such as issue/return operations.
The system includes full authentication, real-time inventory updates, background tasks, DAO structure, and clean separation of concerns.

Designed according to Review 1 marking rubric, ensuring maximum marks in:

✔ Problem Understanding & Solution Design
✔ Core Java Concepts (OOP, Interfaces, Collections, Exception Handling)
✔ Database Integration (JDBC + DAO Layer)
✔ Servlet–JSP Web Integration (MVC)

✨ Features
🔐 User Authentication

-Secure login system for Librarian
-Session management
-Error handling for invalid credentials

📚 Book Management
-Add new books
-Update book information
-Delete books
-Search books by title/author
-View full book catalog
-Backend validation & error handling

👤 Member Management
-Register new members
-Update member details
-View member list
-Search members
-Manage active/inactive status

🔄 Issue / Return System
-Issue books to members
-Check availability before issuing
-Auto calculation of return dates
-Return books and update stock
-Maintain full transaction history

📊 Reports & Dashboard
-Total books, issued books, available books
-Member count
-Issue/Return logs
-Low-stock alerts

🔧 Technical Highlights (Rubric Coverage)

✔ Core Java Concepts 
-OOP: Inheritance, Polymorphism, Encapsulation
-Interfaces: Repository interfaces for DAO
-Custom Exceptions: BookNotAvailableException, DatabaseException
-Collections: Used in caching book lists & reports
-Multithreading: A background thread sends low-stock alerts

✔ Database Integration
-Proper DAO Pattern
-PreparedStatement (SQL Injection safe)
-Connection pooling (optional)
-Full CRUD operations

✔ Servlets & Web Integration 
-MVC structure
-JSP for UI
-Servlets as controllers
-JSTL for dynamic rendering
-Session tracking
-Form validation

🛠 Technologies Used
Backend
-Java Servlets
-JSP
-JDBC
-MySQL
-DAO Pattern
-OOP principles

-Frontend
-HTML5
-CSS3
-JSP/JSTL
-Bootstrap UI
-Server
-Apache Tomcat (8/9/10)

🚀 How to Run
1. Prerequisites
-Java JDK 8 or higher
-Apache Tomcat 9+
-MySQL Server
-MySQL Connector/J
-Any IDE (VS Code, IntelliJ, Eclipse)
