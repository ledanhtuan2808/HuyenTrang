<%--
  Created by IntelliJ IDEA.
  User: ledan
  Date: 14/03/2026
  Time: 7:30 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/sinhvien/sua" method="post">
    id; <input type="text" name="id" id="" readonly value="${sv.id}">
    ten: <input type="text" name="ten" id="" value="${sv.ten}"><br>
    tuoi: <input type="text" name="tuoi" id="" value="${sv.tuoi}"><br>
    gioi tính:<br>
    nam <input type="radio" name="gioitinh" id="" value="true" ${sv.gioiTinh == true ? "checked" : ""}>
    nu <input type="radio" name="gioitinh" id="" value="false" ${sv.gioiTinh == false ? "checked" : ""}>
    <br>
    <button>save</button>
</form>
</body>
</html>
