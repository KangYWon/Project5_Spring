<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit Form</title>
</head>
<body>

<h1>Edit Form</h1>
<form:form modelAttribute="u" method="post" action="../editok">
	<form:hidden path="seq"/>
	<table id="edit">
		<tr>
			<td>제목:</td>
			<td><form:input path="title"/></td>
		</tr>
		<tr>
			<td>작성자:</td>
			<td><form:input path="writer"/></td>
		</tr>
		<tr>
			<td>카테고리:</td>
			<td><form:input path="category"/></td>
		</tr>
		<tr>
			<td>내용:</td>
			<td><form:textarea path="content" cols="50" rows="5"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="수정"/>
				<input type="button" value="취소" onclick="history.back()"/></td>
		</tr>
	</table>
</form:form>

</body>
</html>