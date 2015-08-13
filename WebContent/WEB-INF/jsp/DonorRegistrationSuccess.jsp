<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>Thank you for registering! Here's the review of your details:</h3>
                </td>
            </tr>
            <tr>
                    <td>Donor Id</td>
                    <td>${DonorForm.did}</td>
                </tr>
                <tr>
                    <td>Donor Name</td>
                    <td>${DonorForm.dname}</td>
                </tr>
                <tr>
                    <td>Donor Blood Group</td>
                    <td>${DonorForm.dbloodgroup}</td>
                </tr>
                <tr>
                    <td>Donor Age</td>
                    <td>${DonorForm.dage}</td>
                </tr>
                <tr>
                    <td>Donor Gender</td>
                    <td>${DonorForm.dgender} /></td>
                </tr>
                <tr>
                    <td>Donor last Donation Date</td>
                    <td>${DonorForm.dlastdonated}</td>
                </tr>
                <tr>
                    <td>Donor PWD</td>
                    <td>${DonorForm.dpwd}</td>
                </tr>
                <tr>
                    <td>Donor Location X-Coordinate</td>
                    <td>${DonorForm.dlocationx}</td>
                </tr>
                <tr>
                    <td>Donor Location Y-Coordinate</td>
                    <td>${DonorForm.dlocationy}</td>
                </tr>
                <tr>
                    <td>Donor Contact</td>
                    <td>${DonorForm.dcontact}</td>
                </tr>
 
        </table>
    </div>

</body>
</html>