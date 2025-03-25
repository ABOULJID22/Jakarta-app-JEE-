<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
    <h1>Books</h1>
    <a href="add.jsp">Add New Book</a>
    <table>
        <tr>
            <th>Title</th>
            <th>Author</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>
                    <a href="/book?action=edit&id=${book.id}">Edit</a>
                    <a href="/book?action=delete&id=${book.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
