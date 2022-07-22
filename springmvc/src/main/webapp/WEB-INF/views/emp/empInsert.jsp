<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Emp</title>
</head>
<body>
    <h1>사원 등록</h1>
    <form action="empInsert" method="post">
        <div><input name="email">이메일</div>
        <div><input type="date" name="hire_date" >입사일</div>
        <div><input name="job_id">직책</div>
        <div><input name="last_name">이름</div>
        <div><button>등록</button></div>
    </form>
</body>
</html>