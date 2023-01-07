<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		<br><br>
		Last name: <form:input path="lastName" />
		<br><br>
		Country: <form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br><br>
		Favorite Language:
		Java<form:radiobutton path="favoriteLanguage" value="Java" />
		C++<form:radiobutton path="favoriteLanguage" value="C++" />
		ColdFusion<form:radiobutton path="favoriteLanguage" value="ColdFusion" />
		French<form:radiobutton path="favoriteLanguage" value="French" />
		<br>
		Linux <form:checkbox path="operatingSystems" value="Linux" /><br>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" /><br>
		MS Windowns <form:checkbox path="operatingSystems" value="MS Windows" /><br><br>
		<input type="submit" value="Submit" />
		<br><br>
		
	</form:form>

</body>
</html>