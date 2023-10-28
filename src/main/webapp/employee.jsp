<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/28/2023
  Time: 6:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>le</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<form action="list.jsp">
    <div class="form-group">
        <label for="exampleInputEmail1">Full Name</label>
        <input type="text" class="form-control" id="fullname"  placeholder="Enter name">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Birthday</label>
        <input type="date" class="form-control" id="birth"  >
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Address</label>
        <input type="text" class="form-control" id="address"  placeholder="Enter address">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Position</label>
        <input type="text" class="form-control" id="position"  placeholder="Enter position">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Department</label>
        <input type="text" class="form-control" id="department"  placeholder="Enter department">
    </div>


    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
