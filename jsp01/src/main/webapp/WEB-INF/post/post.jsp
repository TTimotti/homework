<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post</title>
</head>
<body>
    <h1>Post 작성 페이지</h1>

    <form method="post">
        <div>
            <label>글번호</label> 
            <input type="number" name="id" placeholder="글번호" />
        </div>
        <div>
            <label>제목</label> 
            <input type="text" name="title" placeholder="제목" />
        </div>
        <div>
            <label>본문</label>
            <textarea name="content" cols="30" rows="10"></textarea>
        </div>
        <div>
            <label>작성일</label> 
            <input type="datetime-local" name="createTime" placeholder="작성일" />
        </div>
        <div>
            <input type="submit" value="등록" />
        </div>
    </form>
</body>
</html>