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
	<div class="container">
	Hi!
	</div>

</body>
</html>
