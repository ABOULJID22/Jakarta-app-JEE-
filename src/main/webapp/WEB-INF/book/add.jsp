<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book</title>
</head>
<body>
    <h1>Add Book</h1>
    <form action="/book" method="post">
        Title: <input type="text" name="title" required /><br />
        Author: <input type="text" name="author" required /><br />
        Description: <textarea name="description" required></textarea><br />
        <input type="submit" value="Add Book" />
    </form>
</body>
</html>
