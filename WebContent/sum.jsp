<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page errorPage="project-error.jsp" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sum Page</title>
</head>
<body>

<%!
int a = 10;
int b = 20;

int result;

int sum(int x, int y){
	return x+y;
}


%>

<%

result = sum(a, b);
out.print(result);

int i = 30;

result = result + i;

ArrayList list = new ArrayList();

list.add("Core Java");
list.add("Advance Java");
list.add("Java Frameworks");


int d = 10/0;
%>

<%= result %>
<%= list.get(1) %>



</body>
</html>