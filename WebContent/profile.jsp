<jsp:include page="header.jsp">
<jsp:param value="${param.userName }" name="un"/>
</jsp:include>

<h1>Login successful...</h1>
<br>
<%= request.getParameter("trainerName") %>