<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-12-09
  Time: 오전 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    for (int i = 1; i <= 150; i++) {
        String color = i % 2 == 0 ? "red" : "blue";
%> 
        <p style="font-size:<%=i%>px; color:<%=color%>;">hello</p>
<%
    }
%>
</body>
</html>
