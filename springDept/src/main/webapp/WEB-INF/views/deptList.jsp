<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dept List</title>
<style>
table.type02 {
  border-collapse: separate;
  border-spacing: 0;
  text-align: left;
  line-height: 1.5;
  border-top: 1px solid #ccc;
  border-left: 1px solid #ccc;
  margin : 20px 10px;
}
table.type02 th {
  width: 150px;
  padding: 10px;
  font-weight: bold;
  vertical-align: top;
  border-right: 1px solid #ccc;
  border-bottom: 1px solid #ccc;
  border-top: 1px solid #fff;
  border-left: 1px solid #fff;
  background: #eee;
}
table.type02 td {
  width: 350px;
  padding: 10px;
  vertical-align: top;
  border-right: 1px solid #ccc;
  border-bottom: 1px solid #ccc;
}
</style>
</head>
<body>
    
    <table class="type02">
    <tr scope="row">
        <th>부서번호</th>
        <th>부서이름</th>
        <th>매니저 ID</th>
        <th>지역 번호</th>
    </tr>
    <c:forEach var="dept" items="${list}">
    <tr scope="row">    
        <td>${dept.department_id}</td>  
        <td>${dept.department_name}</td>  
        <td>${dept.manager_id}</td>  
        <td>${dept.location_id}</td>
    </tr>
    </c:forEach>
    </table> 
</body>
</html>