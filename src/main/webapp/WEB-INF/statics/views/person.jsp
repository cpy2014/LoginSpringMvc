<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Person</title>


    <%--<link href="..../js/jquery-3.2.1.min.js">--%>

    <%--<link href="..../views/person.js">--%>





</head>
<body>




<h1>person add</h1>
    <div>
        <form action="toPerson" method="post">
        <div>
                <label>name</label>
                <input id="name" name="name">
            </div>
        <div>
                <label>age</label>
                <input id="age" name="age">
            </div>

        <div>
            <button type="submit" id="commitssss">commit </button>
            <button type="button" id="resetsss">reset</button>
        </div>
        </form>

    </div>











</body>
</html>
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/js/business/person.js"></script>

