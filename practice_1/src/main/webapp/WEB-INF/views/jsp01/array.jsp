<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-12-09
  Time: 오전 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  String[] fruits = {"apple", "peach", "grapes", "orange"};
%>
<ul>
  <% for (String fruit : fruits) { %>
      <li><%=fruit%></li>
<% } %>
</ul>
</body>
</html>
