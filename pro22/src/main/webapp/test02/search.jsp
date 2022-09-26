<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<% request.setCharacterEncoding("utf-8"); %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="<%= request.getContextPath() %>"></c:set> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	.cls1{
		font-size: 40px;
		text-align: center;
		list-style: none;
		text-decoration: none;
	}
</style>
<title>회원 정보 검색창</title>
</head>
<body>
	<form action="${contextPath}/mem3.do">
		입력 : <input type="text" name="value" />
		<select name="action">
			<option value="listMembers">전체조회</option>	
			<option value="selectMemberById">아이디조회</option>	
			<option value="selectMemberByPwd">비밀번호조회</option>	
		</select><br>
		<input type="submit" value="검색" />
	</form>
</body>
</html> --%>