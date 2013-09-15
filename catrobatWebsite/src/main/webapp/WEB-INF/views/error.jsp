<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<%@include file="top-scripts.jspf"%>
</head>
<body>
	<div class="navbar">
		<div class="navbar-inner">
			<div>
				<br> <img src="resources/catrobat_logo.png"
					class="pull-left  img-rounded">
			</div>
			<div class="well well-mini pull-right">
				<form id="upload_form" method="post" action=""
					enctype="multipart/form-data" onSubmit="">
					<input class="file_form btn-default btn-block" type="file"
						name="file"> <input type="submit"
						class="btn pull-right btn-primary">
				</form>

			</div>
		</div>
	</div>
	<div class="hero-unit">
	<h3> ${errorTitle}</h3>
	<div> ${errorMsg}</div>
	</div>
</body>
</html>
