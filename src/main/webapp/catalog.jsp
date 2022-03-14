<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<meta charset="ISO-8859-1">
<title>Catalog</title>
</head>
<body>
	<div class="d-flex justify-content-center mt-5">
		<div class="card card-primary w-50">
			<div class="card-header bg-primary text-white">List of books</div>
			<div class="card-body">
					<form action="addCart" method="post">
					<table class="table table-striped">
						<c:forEach items="${books}" var="book">
							<tr>
								<td>
									<div class="form-group">
										<input name="book" type="checkbox" value="${book.title}"/>
										<label>${book.title}</label>
									</div>
								</td>
							</tr>
						</c:forEach>	
					</table>
					<div class="form-group">
						<br/>
						<div class="d-flex flex-row-reverse">
							<button type="reset" class="btn btn-danger">cancel</button>
							<button type="submit" class="btn btn-success">add to cart</button>	
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>