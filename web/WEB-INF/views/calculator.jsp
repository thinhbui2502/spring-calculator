<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/05/2020
  Time: 8:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form  method="post">
    <input type="number" name="number1">
    <input type="number" name="number2"> <br>
    <input type="submit" name="operator" value="+">
    <input type="submit" name="operator" value="-">
    <input type="submit" name="operator" value="*">
    <input type="submit" name="operator" value="/"><br>
</form>
<p>Result: ${result}</p>

</body>
</html>
