<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<!-- ajax call using jquery to check that pert id is already present in the db -->
<script>
	$(document).ready(function() {
		$("#id").change(function() {
			$.ajax({
				url : 'validateId',
				data : {
					id : $("#id").val()
				},
				success : function(responseText) {
					$("#errMsg").text(responseText);

					if (responseText != "") {
						$("#id").focus();
					}
				}
			})
		});
	});
</script>
</head>
<body>
	<div class="container">
		<form action="showRegistered" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Id</label> <input
					type="text" class="form-control" id="id"
					aria-describedby="emailHelp" name="userid"> <span
					id="errMsg"></span>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">name</label> <input
					type="text" class="form-control" id="exampleInputPassword1"
					name="name">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">email</label>
				<input type="email" class="form-control" id="exampleInputPassword1"
					name="email">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	<br>
	<div class="container">${result}</div>
</body>
</html>