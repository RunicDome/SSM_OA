<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2023/12/18
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <script rel="stylesheet" href="bootstrap/js/bootstrap.js"></script>
    <script rel="stylesheet" href="bootstrap/js/jquery-1.12.4.js"></script>
</head>
<body>
        <h1>角色列表</h1>
        <table>
            <tr><td>角色ID</td><td>名称</td></tr>
            <c:forEach  items="${roleList}" var="role">
                    <tr>
                        <td>${role.rid}</td>
                        <td>${role.rName}</td>
                    </tr>
            </c:forEach>
        </table>
</body>
</html>
