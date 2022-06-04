
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
    <h3>반갑습니다.</h3>
    <form action="sample.html" method="post">
        <input type="text" name="name" value="이규찬">
        <input type="number" name="age" value="26">
        <input type="submit" value="요청">
    </form>
    <a href="sample.html?name=김길동&age=11">sample 페이지</a>
    
    <script>
      let xhtp = new XMLHttpRequest();
      xhtp.open('open','TestServlet');
      xhtp.send();
      xhtp.onload = function() {
    	  let result = xhtp.responseXML;
    	  console.log(result);
    	  let names = result.getElementsByTagName('name'); // return 타입 : html 컬렉션(배열)
    	  for(let i=0; i<names.length; i++){
    		  let p = document.createElement('p');
    		  p.textContent = names[i].textContent;
    		  document.body.append(p);
    	  }
      }
    </script>
</body>
</html>