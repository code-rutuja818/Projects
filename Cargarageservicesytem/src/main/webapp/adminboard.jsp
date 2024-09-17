<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<script type="module"
	src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule
	src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
<link href="CSS/adminstyle.css" rel="stylesheet" />
</head>
<body>
	<div class="container-fluid">
		<div class="row flex-nowrap">
			<div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0"
				style="background-color: #10898d">
				<div
					class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">

					<ul
						class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start"
						id="menu">
						<li><a href="#submenu1" 
							class="nav-link px-0 align-middle"> <i
								class="fs-4 bi-speedometer2"></i> <span
								class="ms-1 d-none d-sm-inline text-light">Customer</span>
						</a>
							<ul class="collapse show nav flex-column ms-1" id="submenu1"
								data-bs-parent="#menu">
								<li class="w-100"><a href="addcustomer.jsp"
									class="nav-link px-0"> <span
										class="d-none d-sm-inline text-light">New customer</span>
								</a></li>
								<li><a href="viewcustomer.jsp" class="nav-link px-0"> <span
										class="d-none d-sm-inline text-light">Veiw customer</span>
								</a></li>
							</ul></li>
						<li><a href="#submenu1" 
							class="nav-link px-0 align-middle"> <i
								class="fs-4 bi-speedometer2"></i> <span
								class="ms-1 d-none d-sm-inline text-light">Car</span>
						</a>
							<ul class="collapse show nav flex-column ms-1" id="submenu1"
								data-bs-parent="#menu">
								<li class="w-100"><a href="addvehicle.jsp"
									class="nav-link px-0"> <span
										class="d-none d-sm-inline text-light">New Car</span>
								</a></li>
								<li><a href="viewvehicle.jsp" class="nav-link px-0"> <span
										class="d-none d-sm-inline text-light">Veiw Car</span>
								</a></li>
							</ul></li>
							<li><a href="#submenu1" 
							class="nav-link px-0 align-middle"> <i
								class="fs-4 bi-speedometer2"></i> <span
								class="ms-1 d-none d-sm-inline text-light">Service</span>
						</a>
							<ul class="collapse show nav flex-column ms-1" id="submenu1"
								data-bs-parent="#menu">
								<li class="w-100"><a href="addservice.jsp"
									class="nav-link px-0"> <span
										class="d-none d-sm-inline text-light">New Service</span>
								</a></li>
								<li><a href="viewservice.jsp" class="nav-link px-0"> <span
										class="d-none d-sm-inline text-light">View Service</span>
								</a></li>
							</ul></li>
						
							

							
						<li><a href="#" class="nav-link px-0 align-middle"> <i
								class="fs-4 bi-people"></i> <span
								class="ms-1 d-none d-sm-inline text-light">Bill</span>
						</a></li>
						<li><a href="home.jsp" class="nav-link px-0 align-middle"> <i
								class="fs-4 bi-people"></i> <span
								class="ms-1 d-none d-sm-inline text-light">Logout</span>
						</a></li>
					</ul>


				</div>
			</div>
</body>
</html>