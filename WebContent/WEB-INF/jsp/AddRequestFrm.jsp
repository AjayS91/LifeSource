<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Blood Request</title>
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
      document.getElementById('nlocationx').value=pos.lat;
      alert(pos.lat);
      document.getElementById('nlocationy').value=pos.lng;
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
<body>
	<h1>Add Request</h1>
	<hr />
	<form:form method="post" commandName="request" action="addrequest.html">
		<table>
			<tr>
				<td>Blood Group :</td>
				<td><form:input path="nbloodgroup" /> <form:errors path="nbloodgroup" /></td>
			</tr>

			<tr>
				<td>No of Units :</td>
				<td><form:input path="units" /> <form:errors path="units" /></td>
			</tr>
			<tr>
				<td colspan="2"><div id="map"></div></td>
			</tr>
			<form:hidden path="nlocationx"/>
			<form:hidden path="nlocationy"/>
			<tr>
				<td>Description :</td>
				<td><form:input path="description" />
			</tr>
			<tr>
				<td colspan="2"><input type="submit" /></td>
			</tr>
		</table>



	</form:form>
	<a href="index.jsp">home</a>
</body>
</html>