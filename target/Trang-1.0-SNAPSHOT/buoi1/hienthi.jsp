<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ledan
  Date: 12/03/2026
  Time: 7:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/sinhvien/them" method="post">
    ten: <input type="text" name="ten" id=""><br>
    tuoi: <input type="text" name="tuoi" id=""><br>
    gioi tính:<br>
    nam <input type="radio" name="gioitinh" id="" value="true">
    nu <input type="radio" name="gioitinh" id="" value="false">
    <br>
    <button>save</button>
</form>
<table>
    <tr>
        <td>id</td>
        <td>tên</td>
        <td>tuổi</td>
        <td>giới tính</td>
        <td>Action</td>
    </tr>
    <c:forEach var="sv" items="${list}">
        <tr>
            <td>${sv.id}</td>
            <td>${sv.ten}</td>
            <td>${sv.tuoi}</td>
            <td>${sv.gioiTinh == true ? "nam":"nữ"}</td>
            <td>
                <a href="/sinhvien/viewupdate?id=${sv.id}">View Update</a>
                <a href="/sinhvien/xoa?id=${sv.id}">xóa</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
