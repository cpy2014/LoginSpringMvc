<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>UserAdd</title>


    <%--<link href="..../js/jquery-3.2.1.min.js">--%>

    <%--<link href="..../views/person.js">--%>





</head>
<body>




<h1>User add</h1>
<div>
    <form action="userAdd" method="post">
        <div>
            <label>name</label>
            <input type="text" id="name" name="name"><label>${errorName}</label>
        </div>
        <div>
            <label>age</label>
            <input type="password" id="password" name="password"><label>${errorPassword}</label>
        </div>

        <div>
            <button type="submit" id="commit">commit </button>
            <button type="reset" id="reset">reset</button>
        </div>
    </form>

</div>











</body>
</html>
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/js/business/person.js"></script>

