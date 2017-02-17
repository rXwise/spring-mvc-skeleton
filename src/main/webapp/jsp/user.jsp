<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Add New User</title>
</head>
<body>
	<h1>Add New User</h1>
	<form:form method="POST" modelAttribute="user" action="/user">
		<table>
			<tr>
				<td><form:label path="username">Username: </form:label></td>
				<td><form:input path="username"/></td>
			</tr>
			<tr>
				<td><form:label path="password">Password: </form:label></td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">Add User</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>