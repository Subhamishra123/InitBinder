<%@ page language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p style="color: red;text-align: center;">
<form:errors path="*"/>
</p>
<form:form modelAttribute="cricketer">
<table border="1" align="center" bgcolor="cyan">
<tr>
<td>Cricketer Name ::</td>
<td>
<form:input path="cricketerName"/>
</td>
</tr>
<tr>
<td>Cricketer Type ::</td>
<td>
<form:input path="cricketerType"/>
</td>
</tr>
<tr>
<td>Cricketer DOB ::</td>
<td>
<form:input path="dob" type="date"/>
</td>
</tr>
<tr>
<td>Cricketer Debut ::</td>
<td>
<form:input path="debutDate" type="date"/>
</td>
</tr>
<tr>
<td><input type="submit" value="register"/></td>
<td>
<td><input type="reset" value="cancel"/></td>
</td>
</tr>
</table>

</form:form>
</body>
</html>