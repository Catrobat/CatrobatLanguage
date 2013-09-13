<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<%@include file="scripts.jspf"%>
</head>
<body>
	<div class="navbar">
		<div class="navbar-inner">
			<br> <img src="resources/catrobat_logo.png"
				class="pull-left  img-rounded">
			<div class="well well-mini pull-right">
				<form id="upload_form" method="post" enctype="multipart/form-data"
					onSubmit="">
					<input class="file_form btn-default btn-block" type="file"
						name="file" />
				</form>
				<div class="btn pull-right" onclick="SendFile();">Upload file</div>
			</div>
		</div>
	</div>


	<div class="tabbable tabs-left">
		<ul class="nav nav-tabs">
			<li>
				<div class="well pull-left">
					<ul class="nav nav-list navbar-inner">
						<li class="nav-header"><a href="#"><h3>Header</h3></a></li>
						<li class="nav-header"><h3>ObjectList</h3></li>

						<li class="active"><a href="#"><h4>Object1</h4></a></li>
						
						<li class="nav-header"><a href="#"><h3>Variables</h3></a></li>
					</ul>
				</div>
			</li>
		</ul>
		<div class="tab-content">
			<div class="well">
				<div class="container-fluid">
					<div class="row-fluid" id="menu">
					<h3><c:out value="${requestScope.Project}"/></h3>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
