<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>欢迎来到工单系统界面</title>
  </head>
  
  <body>
	<form action="login.action" method="post">
    		<input type="submit" value="提交">
	</form>
  </body>
</html>
