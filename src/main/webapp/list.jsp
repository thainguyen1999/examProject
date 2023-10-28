<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/28/2023
  Time: 8:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Address</th>
        <th scope="col">Birthday</th>
        <th scope="col">Position</th>
        <th scope="col">Department</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td><c:out value="${employee.fullname}" /></td>
            <td><c:out value="${employee.address}" /></td>
            <td><c:out value="${employee.birthday}" /></td>
            <td><c:out value="${employee.position}" /></td>
            <td><c:out value="${employee.department}" /></td>

            <td><c:out value="${employee.id}" /></td>


        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
