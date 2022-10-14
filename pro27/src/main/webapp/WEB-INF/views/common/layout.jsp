<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
   #container{
   	  /* width: 100%; */		
      width: 1000px;
      margin: 0px auto;
      text-align: center;
      border: 0px solid #bcbcbc;
   }
   #header{
      padding: 5px;
      margin-bottom: 5px;
      border: 0px solid #bcbcbc;
      background-color: #dcdcdc;
   }
   #sidebar-left{
   	  /* width: 15%; */	
      width: 150px; 
      height: 700px;
      padding: 5px;
      margin-right: 5px;
      margin-bottom:5px;
      float: left;
      background-color: #bcbcbc;
      border: 0px solid #bcbcbc;
      font-size: 10px;
   }
   #content{
      width: 75%;
      padding: 5px;
      margin-right: 5px;
      float: left;
      border: 0px solid #bcbcbc;
   }
   #footer{
      clear: both;
      padding: 5px;
      border: 0px solid #bcbcbc;
      background-color: #dcdcdc;
   }
</style>
<title><tiles:insertAttribute name="title"></tiles:insertAttribute></title>
</head>
<body>
	<div id="container">
		<div id="header">
			<tiles:insertAttribute name="header"></tiles:insertAttribute>
		</div>
		<div id="sidebar-left">
			<tiles:insertAttribute name="side"></tiles:insertAttribute>
		</div>
		<div id="content">
			<tiles:insertAttribute name="body"></tiles:insertAttribute>
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer"></tiles:insertAttribute>
		</div>
	</div>
</body>
</html>