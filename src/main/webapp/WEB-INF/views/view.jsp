<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>View Post</title>
</head>
<body>

<h1>View Post</h1>

<table>
    <tr><td>Category:</td><td>${boardVO.category}</td></tr>
    <tr><td>Title:</td><td>${boardVO.title}</td></tr>
    <tr><td>Writer:</td><td>${boardVO.writer}</td></tr>
    <tr><td>Content:</td><td>${boardVO.content}</td></tr>
</table>

<a href="../list">Back to List</a>

</body>
</html>
