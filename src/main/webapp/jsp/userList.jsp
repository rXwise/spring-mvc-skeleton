<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Users</title>
</head>
<body>
	<h1>Users</h1>
	<table>
		<c:forEach var="bean" items="${user}">
			<tr>
				<td>${bean.username}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>