<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
<style type="text/css">
td{
     background-color: #708090;
     padding: 10px;
    
   }
table{
	 border-spacing: 0px;
	 margin: 0 auto;
}
h1{
    text-align:center;
    color:red;
    font-size:40px;
	text-shadow: 5px 5px 5px #000;
}
p{
   text-align:right;
}
h3{
	text-align:center;
	font-size:40px;
}
</style>
</head>
<body>
<h1>Life Source</h1>
<p><a href="">Sign Up</a></p>
<h3>Login Page</h3>
<form action="">
  <table>
      <tr>
         <td>User name</td>
         <td><input type="text" name="uname" placeholder="username" ></td>
      </tr>
      <tr>
         <td>Password</td>
         <td><input type="password" name="pwd" placeholder="password" ></td>
      </tr>
      <tr>
         <td>user type </td>
         <td>
         <select name="user"  >
         <option value="donor" >Donor</option>
         <option value="needy">Needy</option>
         <option value="bloodbank">Blood Bank</option>
         </select>
         </td>
      </tr>
      <tr>
     <td></td>
      <td><input type="submit" value="login"/></td>
      </tr>
  </table>
</form>
</body>
</html>