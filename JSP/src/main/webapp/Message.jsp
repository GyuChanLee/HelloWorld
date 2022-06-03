<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Message</title>
<style>
    #show{
        width:500px;
        height:300px;
        border: 1px solid blue;
    }
</style>
</head>
<body>

<%
  String user = request.getParameter("user");
%>

    <div id="show">
      <div class="row">hhhh > hhhh</div>
    </div>
        <input type="text" name="content">
        <input type="hidden" name="writer" value="<%=user%>">
    
    <script>
    
      document.querySelector('input[name="content"]').addEventListener('change',changeCall);
      function changeCall(e) {
    	  let content = document.querySelector('input[name="content"]').value;
    	  let writer = document.querySelector('input[name="writer"]').value;
    	  
    	  fetch('message', {
    		  method:'POST',
    		  headers:{'Content-type':'application/x-www-form-urlencoded'},
    		  body:'writer=' + writer + '&content=' + content
    	  })
    	       .then(resolve => {
    	    	   e.target.value = '';
    	       })
    	       .catch(err => console.log(err))
      }
    
      setInterval(e => {
    	  let lastMsg = -1;
    	  fetch('message')
    	      .then(result => result.json())
    	      .then(resolve => {
    	    	    // 기존 화면의 메시지 지우기
    	    	    let divs = document.querySelectorAll('.row');
    	    	    divs.forEach(el => el.remove());
    	    	    
    	    	    filArr = resolve.filter (e => {
    	    	    	return e.msgId > lastMsg - 14;
    	    	    })
    	    	    
    	    	    // 조회된 메시지를 새로 그려주기.
    	    	    let show = document.getElementById('show');
    	    	    filArr.forEach(row => {
    	    	      lastMsg = row.msg_id;
    	    	      let div = createRow(row);
    	    	      show.append(div);
    	    	    });
    	    	  })
    	      .catch(error => console.log(error));
      }, 1000);
      
      function createRow(message) {
    	  let div = document.createElement('div');
    	  div.setAttribute('class','row');
    	  let txt = document.createTextNode(message.writer+'> '+message.content);
    	  div.append(txt);
    	  return div;
      }
    </script>
</body>
</html>