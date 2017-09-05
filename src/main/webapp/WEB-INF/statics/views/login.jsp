<%--
  Created by IntelliJ IDEA.
  User: TonyC
  Date: 2017/9/1
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>LoginPage</h1>
    <div>
        <form action="login" method="post">
            <div>
                <label>name</label>
                <input type="text" id="name" name="name"><label>${errorName}</label>
            </div>
            <div>
                <label>password</label>
                <input type="password" id="password" name="password"><label>${errorPassword}</label>
            </div>

            <div>
                <button type="submit">login </button>
                <button type="reset" >reset</button><label>${errorResult}</label>
                <button type="button" id="userAdd_bt">用户注册</button>
            </div>
        </form>

    </div>

</body>
</html>
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>

<script type="text/javascript" src="/js/business/login.js"></script>