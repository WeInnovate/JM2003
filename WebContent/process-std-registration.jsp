<jsp:useBean id="std" class="com.atuldwivedi.learn.model.Student" />
<jsp:setProperty property="*" name="std" />
<jsp:setProperty property="percentage" name="std" value="88.9" />

${std}
<br>
Name from getProperty: <jsp:getProperty property="name" name="std" />