<%@ page import="com.atuldwivedi.learn.model.Student" %>
<jsp:useBean id="std" class="com.atuldwivedi.learn.model.Student" />
<jsp:setProperty property="*" name="std" />
<jsp:setProperty property="percentage" name="std" value="88.9" />

<%-- 
<%
Student student = new Student();
out.print("Student before setting values: "+student);

student.setName(request.getParameter("name"));
student.setAge(Integer.parseInt(request.getParameter("age")));

out.print("Student after setting values: "+student);

%> 
--%>
${std}

<br>
Name from getProperty: <jsp:getProperty property="name" name="std" />