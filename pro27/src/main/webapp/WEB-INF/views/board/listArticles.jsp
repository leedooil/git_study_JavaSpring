<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<%-- <c:set var="articlesList" value="${articlesMap.articlesList}"></c:set>
<c:set var="totArticles" value="${articlesMap.totArticles}"></c:set>
<c:set var="section" value="${articlesMap.section}"></c:set>
<c:set var="pageNum" value="${articlesMap.pageNum}"></c:set> --%>
<% request.setCharacterEncoding("utf-8"); %>    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.cls1 {
		text-decoration: none;
	}
	
	.cls2 {
		text-align: center;
		font-size: 30px;
	}
	
	.no-uline {
		text-decoration: none;
	}
	
	.sel-page {
		text-decoration: none;
		color: red;
	}
</style>
<meta charset="UTF-8">
<title>글목록창</title>
</head>
<script type="text/javascript">
	function fn_articleForm(isLogOn,articleForm,loginForm){
		if (isLogOn != '' && isLogOn != 'false') {
			location.href=articleForm;
		}else {
			alert("로그인 후 글쓰기가 가능합니다.")
			location.href=loginForm+'?action=/board/articleForm.do';
		}
	}
</script>
<body>
	<table align="center" width="100%" border="1px">
		<tr align="center" bgcolor="#dcdcdc">
			<td width="3%">글번호</td>
			<td width="3%">작성자</td>
			<td width="10%">제목</td>
			<!-- <td width="10%">이미지파일 이름</td> -->
			<td width="3%">작성일</td>
		</tr>
		<c:choose>
			<c:when test="${articlesList == null}">
				<tr height="10">
					<td colspan="4"><p align="center"><b><span style="font-size: 9pt;">등록된 글이 없습니다.</span></b></p></td>
				</tr>
			</c:when>
			<c:when test="${articlesList != null}">
				<c:forEach var="article" items="${articlesList}" varStatus="articleNum">
					<tr align="center">
						<td width="5%">${articleNum.count}</td>
						<td width="10%">${article.id}</td>
						<td width="35%" align="left">
							<span style="padding-right: 30px"></span>
							<c:choose>
								<c:when test='${article.level > 1}'>
									<c:forEach begin="1" end="${article.level}" step="1">
										<span style="padding-left: 20px"></span>
									</c:forEach>
									<span style="font-size: 12px;">[답변]</span>
									<a class="cls1" href="${contextPath}/board/viewArticle.do?articleNO=${article.articleNO}">${article.title}</a>
								</c:when>
								<c:otherwise>
									<a class="cls1" href="${contextPath}/board/viewArticle.do?articleNO=${article.articleNO}">${article.title}</a>
								</c:otherwise>
							</c:choose>
						</td>
						<%-- <td width="10%">${article.imageFileName}</td> --%>
						<td width="10%"><fmt:formatDate value="${article.writeDate}"/></td>
					</tr>
				</c:forEach>
			</c:when>
		</c:choose>
	</table>
	
	<%-- <div class="cls2">
	<c:if test="${totArticles != null}">
		<c:choose>
			
			<c:when test="${totArticles > 100}">
				<c:forEach var="page" begin="1" end="10" step="1">
					<c:if test="${section>1 && page==1}">
						<a class="no-uline" href="${contextPath}/board/listArticles.do?section=${section-1}&pageNum=${(section-1)*10+1}">&nbsp; pre</a>
					</c:if>
						<a class="no-uline" href="${contextPath}/board/listArticles.do?section=${section}&pageNum=${page}">${(section-1)*10+page}</a>
					<c:if test="${section>1 && page==1}">
						<a class="no-uline" href="${contextPath}/board/listArticles.do?section=${section+1}&pageNum=${section*10+1}">&nbsp; next</a>
					</c:if>
				</c:forEach>
			</c:when>
			
			<c:when test="${totArticles == 100}">
				<c:forEach var="page" begin="1" end="10" step="1">
					<a class="no-uline" href="#">${page} </a>
				</c:forEach>
			</c:when>
			
			<c:when test="${totArticles < 100}">
				<c:forEach var="page" begin="1" end="${totArticles/10 +1}" step="1">
					<c:choose>
						<c:when test="${page==pageNum}">
							<a class="sel-page" href="${contextPath}/board/listArticles.do?section=${section}&pageNum=${page}">${page}</a>
						</c:when>
						<c:otherwise>
							<a class="no-uline" href="${contextPath}/board/listArticles.do?section=${section}&pageNum=${page}">${page}</a>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</c:when>
			
		</c:choose>
	</c:if>
	</div>
	<br><br> --%>
<%-- <a class="cls1" href="${contextPath}/board/articleForm.do"><p class="cls2">글쓰기</p></a> --%>
	<a class="cls1" href="javascript:fn_articleForm('${isLogOn}','${contextPath}/board/articleForm.do','${contextPath}/member/loginForm.do')"><p class="cls2">글쓰기</p></a>
</body>
</html>




























