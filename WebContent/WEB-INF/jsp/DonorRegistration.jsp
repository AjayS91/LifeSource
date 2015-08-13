<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Donor Registration</title>
<script>
function initMap() {
  var map = new google.maps.Map(document.getElementById('map'), {
    center: {lat: -34.397, lng: 150.644},
    zoom: 6
  });
  var infoWindow = new google.maps.InfoWindow({map: map});

  // Try HTML5 geolocation.
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(function(position) {
      var pos = {
        lat: position.coords.latitude,
        lng: position.coords.longitude
      };
      document.getElementById('dlocationx').value=pos.lat;
      alert(pos.lat);
      document.getElementById('dlocationy').value=pos.lng;
      infoWindow.setPosition(pos);
      infoWindow.setContent('Location found.');
      map.setCenter(pos);
    }, function() {
      handleLocationError(true, infoWindow, map.getCenter());
    });
  } else {
    // Browser doesn't support Geolocation
    handleLocationError(false, infoWindow, map.getCenter());
  }
}

function handleLocationError(browserHasGeolocation, infoWindow, pos) {
  infoWindow.setPosition(pos);
  infoWindow.setContent(browserHasGeolocation ?
                        'Error: The Geolocation service failed.' :
                        'Error: Your browser doesn\'t support geolocation.');
}

</script>
<script src="https://maps.googleapis.com/maps/api/js?signed_in=true&callback=initMap" async defer></script>

</head>
<script src="https://maps.googleapis.com/maps/api/js?signed_in=true&callback=initMap" async defer></script>
<body>
	<div align="center">
        <form:form action="ProcessDonorRegister.html" method="post" commandName="newdonor">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Donor - Registration</h2></td>
                </tr>
                <tr>
                    <td>Donor Id</td>
                    <td><form:input path="did" /></td>
                </tr>
                <tr>
                    <td>Donor Name</td>
                    <td><form:input path="dname" /></td>
                </tr>
                <tr>
                    <td>Donor Blood Group</td>
                    <td><form:input path="dbloodgroup" /></td>
                </tr>
                <tr>
                    <td>Donor Age</td>
                    <td><form:input path="dage" /></td>
                </tr>
                <tr>
                    <td>Donor Gender</td>
                    <td><form:select path="dgender" >
                    <form:option value="">Select Gender</form:option>
                    <form:option value="male">MALE</form:option>
                    <form:option value="female">FEMALE</form:option>
                    </form:select></td>
                </tr>
                <tr>
                    <td>Donor last Donation Date</td>
                    <td><form:input path="lastdonate"/></td>
                </tr>
                <tr>
                    <td>Donor PWD</td>
                    <td><form:password path="dpwd" /></td>
                </tr>
                <tr>
                    <!-- <td>Donor Location X-Coordinate</td> -->
                    <td><form:hidden path="dlocationx"/></td>
                </tr>
                <tr>
                    <!-- <td>Donor Location Y-Coordinate</td> -->
                    <td><form:hidden path="dlocationy"/></td>
                </tr>
                <tr>
                    <td>Donor Contact</td>
                    <td><form:input path="dcontact"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
    </div>

</body>
</html>