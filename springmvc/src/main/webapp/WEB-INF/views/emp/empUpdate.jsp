<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Emp</title>
</head>
<body>
    <h1>사원 수정</h1>
    <form action="${pageContext.request.contextPath}/empUpdate" method="post">
        <div><input name="email" value="${emp.email }">이메일</div>
        <div><input type="date" name="hire_date" 
        value='<fmt:formatDate value="${emp.hire_date}" pattern="yyyy-MM-dd"/>'>입사일</div>
        <div><input name="job_id" value="${emp.job_id}" >직책</div>
        <div><input name="last_name" value="${emp.last_name }">이름</div>
        <div><button>등록</button></div>
        <div><button type="button" id="btnDelete">삭제</button></div>
    </form>
<script>
btnDelete.addEventListener("click",function(){
    location.href="${pageContext.request.contextPath}/empDelete?employee_id=${emp.employee_id}";	
});
</script>
</body>
</html>