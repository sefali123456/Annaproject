<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h4>Delete Participant Information</h4>
<form action="ParticipantsController" method="post">
	<input type="hidden" name="operation" value="delete">
	<label>Id</label>
	<input type="number" name="participantid"/><br/>
	<input type="submit" value="delete Participant"/>
	<input type="reset" value="reset"/>
</form>
<br/>
<a href="home.jsp">Back</a>
</body>
</html>