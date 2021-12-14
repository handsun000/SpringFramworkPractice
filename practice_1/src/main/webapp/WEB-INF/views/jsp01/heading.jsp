<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-12-09
  Time: 오전 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    for (int i = 6; i >= 1; i--) {
        out.println("<h"+i+">Heading</h"+i+">");
    }
%>
</body>
</html>
