<%@ page import="common.Contents" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-12-09
  Time: 오전 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<%@ include file="sub.jsp"%>
<style>
    body {
        background: <%=background%>;
    }
</style>
</head>
<body>
<h2>max: <%=Contents.MAX%></h2>
<h2>msg: <%=msg%></h2>
</body>
</html>
