<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<title>cart</title>
</head>
<body>
	<div class="d-flex justify-content-center">
		<div class="card card-primary w-75">
			<div class="card-header bg-primary text-white">cart</div>
			<div class="card-body">
				<table class="table table-striped">
					<tr>
						<th scope="col">title</th>
					</tr>
					<c:forEach items="${cart.books}" var="book">
						<tr>
						<td>${book.title}</td>
						</tr>
					</c:forEach>
				</table>
				<a href="catalog" class="btn btn-primary">return</a>
			</div>
		</div>
	</div>

</body>
</html>