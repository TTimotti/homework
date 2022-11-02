<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post Result</title>
</head>
<body>
    <h1>Post Result 페이지</h1>
    <div>
        <label>글번호</label>
        <input type="text" value="${post.id}" readonly="readonly"/>
    </div>
    <div>
        <label>제목</label>
        <input type="text" value="${post.title}" readonly="readonly"/>
    </div>
    <div>
        <label>본문</label>
        <textarea name="content" cols="30" rows="10">${post.content}</textarea>
    </div>
     <div>
        <label>작성일</label>
        <input type="text" value="${post.createTime}" />
    </div>
</body>
</html>