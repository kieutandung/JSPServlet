<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
<form action="employee" method="post">
    <h1>Danh sách nhân viên</h1>
    <table style="border: 2px solid black; width: 600px">
        <thead>
        <tr style="padding: 10px">
            <th>id</th>
            <th>name</th>
            <th>age</th>
            <th>position</th>
            <th>department</th>
            <th>salary</th>
        </tr>
        </thead>
        <tbody>
        <!-- Iterate over the list of employees -->
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td style="padding-left: 50px">${employee.id}</td>
                <td style="padding-left: 50px">${employee.name}</td>
                <td style="padding-left: 50px">${employee.age}</td>
                <td style="padding-left: 50px">${employee.position}</td>
                <td style="padding-left: 50px">${employee.department}</td>
                <td style="padding-left: 50px">${employee.salary}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
</body>
</html>
