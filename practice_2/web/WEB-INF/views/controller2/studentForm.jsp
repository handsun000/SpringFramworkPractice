<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-12-15
  Time: 오전 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/controller2/studentView">
    이름: <input type="text" name="name"><br>
    나이: <input type="text" name="age"><br>
    학년: <input type="text" name="gradeNum"><br>
    반: <input type="text" name="classNum"><br>
    <input type="submit" value="전송">
</form>
</body>
</html>
