<%--
  Created by IntelliJ IDEA.
  User: ledan
  Date: 24/03/2026
  Time: 4:06 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Ten</th>
        <th>Tuoi</th>
        <th>Gioi tinh</th>
        <th>Hanh dong</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="sv">
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
    </tbody>
</table>
<a href="/sinhvien/phantrang?page=${page - 1}">Prev</a>
<a href="/sinhvien/phantrang?page=${page + 1}">Next</a>
</body>
</html>
