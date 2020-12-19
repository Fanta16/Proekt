<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<style>  
h3{
  font-family: Calibri; 
  font-size: 25pt;         
  font-style: normal; 
  font-weight: bold; 
  color:SlateBlue;
  text-align: center; 
  text-decoration: underline
}
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}
input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}
#button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
	float: left;
}

#button:hover {
	opacity:1;
}
#container {
	padding: 16px;
	margin-left: 35%;
}
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}
@media screen and (max-width: 300px) {
	#button {
		width: 100%;
	}
}
</style> 
</head>
<body>

<h3>Login Page</h3>

	${error}
	<form method="post" action="${pageContext.request.contextPath }/login">
		<div id="container">
			<table border="0" cellpadding="2" cellspacing="2">
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input id="button" type="submit" value="Login"></td>
				</tr>
			</table>
		</div>
	</form>

</body>
</html>
