<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%  
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>主页面</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title">用户列表</h3>
		</div>
		
		<div class="panel-body">
			<div class="table table-responsive">
				<table class="table table-bordered table-hover">
					<tbody class="text-center">
						<tr>
							<th>
								id
							</th>
							<th>
								uname
							</th>
							<th>
								upwd
							</th>
						</tr>
						<c:forEach var="u" items="${allUser }">
							<tr>
								<td>${u.id }</td><!--id是结果集的列名  -->
								<td>${u.uname }</td>
								<td>${u.upwd }</td>
							</tr>
						</c:forEach>
						<tr>
							<td colspan="3">欢迎${sessionScope.myuser.uname }</td>
						</tr>
						<tr>
							<td colspan="3" align="right">
								<ul class="pagination">
									<li><a>第${currentPage}页</a></li>
									<li><a>共${totalPage}页</a></li>
									<c:if test="${currentPage != 1}">
										<li><a href="selectAllUserByPage?currentPage=${currentPage-1}">上一页</a></li>
									</c:if>
									<c:if test="${currentPage != totalPage}">
										<li><a href="selectAllUserByPage?currentPage=${currentPage+1}">下一页</a></li>
									</c:if>
								</ul>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
</body>
</html>