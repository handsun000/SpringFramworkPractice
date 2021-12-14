<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-12-09
  Time: 오전 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Date nowDate=new Date();
    out.println(nowDate + "<br>");
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 mm월 dd일 a HH:mm:ss");
    String formatDate = dateFormat.format(nowDate);
%>
현재 날짜는 <%=formatDate%>입니다.
</body>
</html>
