<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp List</title>
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
        <th>사원번호</th>
        <th>이름</th>
        <th>성</th>
        <th>월급</th>
    </tr>
    <c:forEach var="emp" items="${list}">
    <tr scope="row">    
        <td>${emp.employee_id}</td>  
        <td>${emp.first_name}</td>  
        <td>${emp.last_name}</td>  
        <td>${emp.salary}</td>
    </tr>
    </c:forEach>
    </table> 
    
    <h3>검색</h3>
    <form action="">
        사번<input name="employee_id">
        부서<input type="checkbox" name="depts" value="10">10
            <input type="checkbox" name="depts" value="20">20
            <input type="checkbox" name="depts" value="30">30
        직무<select name="job_id">
                <option value="IT_PROG">IT_PROG
                <option value="ST_CLERK">ST_CLERK
                <option value="ST_MAN">ST_MAN
            </select>
        입사일자<input type="date" name="sdt">~<input type="date" name="edt">
        <button>검색</button>
    </form>
    <hr>
    <table class="type02">
    <tr scope="row">
        <th>사원번호</th>
        <th>이름</th>
        <th>부서번호</th>
        <th>직책</th>
        <th>입사일자</th>
    </tr>
    <c:forEach var="emp" items="${slist}">
    <tr scope="row">    
        <td>${emp.employee_id}</td>  
        <td>${emp.last_name}</td>  
        <td>${emp.department_id}</td>  
        <td>${emp.job_id}</td>
        <td>${emp.hire_date}</td>
    </tr>
    </c:forEach>
    </table>
</body>
</html>