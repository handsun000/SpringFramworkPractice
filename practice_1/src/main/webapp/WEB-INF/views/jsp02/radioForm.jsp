<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form method="post" action="radioSave">
  이름: <input type="text" name="name"><br>
  성별:
  <input type="radio" name="gender" value="male" checked> male
  <input type="radio" name="gender" value="female"> female
  <input type="submit" value="male">
</form>
</body>
</html>
