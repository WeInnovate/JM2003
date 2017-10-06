<%

request.setAttribute("msg", "Hello, you are registered successfully.");
application.setAttribute("website", "www.atuldwivedi.com");

%>

${param.name}
${paramValues.courses[2]}
${requestScope.msg}
${initParam.institute}
${applicationScope.website}