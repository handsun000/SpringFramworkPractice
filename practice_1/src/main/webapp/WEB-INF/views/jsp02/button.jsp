<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-12-09
  Time: 오후 2:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<script>
    function check() {
        var price = document.form1.price.value;
        var amount = document.form1.amount.value;
        if (price == "") {
            alert("가격을 입력하세요.");
            document.form1.price.focus();
            return;
        }
        if (amount == "") {
            alert("수량을 입력하세요.");
            document.form1.amount.focus();
            return;
        }
        document.form1.submit();
    }
</script>
</head>
<body>

<form name="form1" action="button1Save" method="post">
    price: <input type="text" name="price"><br>
    amount: <input type="text" name="amount"><br>
    <button type="button" onclick="check()">OK</button>
</form>

</body>
</html>
