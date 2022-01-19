<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>javaguides.net</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<%@ page isELIgnored="false"%>
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h3 class="text-center">Spring MVC 5 + Spring Data JPA 2 + JSP +
				MySQL Example - Customer Management</h3>
			<hr />

			<input type="button" value="Add Customer"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> <br />
			<br />
			<div>
				 <form>
				        Search by first name:
				        <input name="s" type="text"/>
				        <input type="submit" value="Search"/>
				    </form>
				<br/>
				</div>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Customer List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Email</th>
							<th>Province</th>
							<th>Hobbies</th>
							<th>Action</th>
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempCustomer" items="${customers.content}">

							<!-- construct an "update" link with customer id -->
							<c:url var="updateLink" value="/customer/updateForm">
								<c:param name="customerId" value="${tempCustomer.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/customer/delete">
								<c:param name="customerId" value="${tempCustomer.id}" />
							</c:url>

							<tr>
								<td>${tempCustomer.firstName}</td>
								<td>${tempCustomer.lastName}</td>
								<td>${tempCustomer.email}</td>
								<td>${tempCustomer.province.name}</td>
								<td>
									<c:forEach var="hobby" items="${tempCustomer.hobbies}">
									<span class="btn-sm">${hobby.name}</span>
									</c:forEach>
								</td>
								
								<td>
									<!-- display the update link --> <a href="${updateLink}">Update</a>
									| <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
								</td>

							</tr>

						</c:forEach>

					</table>

				</div>
				<div>
				<div class="d-flex flex-row align-items-center">
				      <c:if test="${customers.hasPrevious()}">
				           <button type="submit" class="btn btn-primary btn-md" style="margin: 2px"
				                   onclick="location.href = 'page?page=1'">&laquo; first</button>
				           <button type="submit" class="btn btn-primary btn-md" style="margin: 2px"
				                    onclick="location.href = 'page?page=${customers.number - 1}'">previous</button>
				      </c:if>
				
				      <c:if test="${customers.totalPages != 1}">
				            <label style="margin: 2px 8px 2px 8px">
				                 Page ${customers.number +1 } of     ${customers.totalPages}
				            </label>
				      </c:if>
				
				      <c:if test="${customers.hasNext()}">
				            <button type="submit" class="btn btn-primary btn-md" style="margin: 2px"
				                   onclick="location.href = 'page?page=${customers.number + 1}'">next</button>
				            <button type="submit" class="btn btn-primary btn-md" style="margin: 2px"
				                   onclick="location.href = 'page?page=${customers.totalPages -1}'">last &raquo;</button>                                    
				      </c:if>
				    </div>
				</div>
			</div>
		</div>

	</div>
	<div class="footer">
		<p>Footer</p>
	</div>
</body>

</html>









