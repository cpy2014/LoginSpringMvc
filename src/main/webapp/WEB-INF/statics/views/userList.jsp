<%--
  Created by IntelliJ IDEA.
  User: TonyC
  Date: 2017/9/1
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>






    <h1>UserList</h1>
    <div>

        <table>
            <tr>
                <th>seq</th>
                <th>id</th>
                <th>name</th>
                <th>password</th>
            </tr>
            <c:forEach  var="user" items="${userList}" varStatus="id">

            <tr>
                <td><c:out value="${id.count}"/></td>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.password}"/></td>
            </tr>
            </c:forEach>


        </table>

    </div>
    <div><a href="/loginHome">return login</a></div>

</body>
</html>
