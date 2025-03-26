<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <form action="login" method="POST">
        <label for="email">Email:</label>
        <input type="email" name="email" required><br><br>
        
        <label for="password">Password:</label>
        <input type="password" name="password" required><br><br>
        
        <input type="submit" value="Login">
    </form>

    <c:if test="${param.error != null}">
        <p style="color: red;">Invalid credentials, please try again.</p>
    </c:if>
    
    <a href="signup.jsp">Don't have an account? Sign up here.</a>
</body>
</html>
