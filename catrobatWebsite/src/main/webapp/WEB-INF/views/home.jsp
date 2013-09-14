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


	<div class="tabbable tabs-left">
		<ul class="nav nav-tabs">
			<li>
				<div class="well pull-left">
					<ul class="nav nav-list navbar-inner">
						<li class="nav-header" id="xmlHeader"><h3>
								<a href="xmlHeader">Header</a>
							</h3></li>
						<li class="nav-header"><h3>ObjectList</h3></li>
						<c:forEach var="name" items="${objectNames}">
							<li id="${name}"><a href="${name}"> ${name}</a></li>
						</c:forEach>
						<li class="nav-header" id="variables"><h3>
								<a href="variables">Variables</a>
							</h3></li>
					</ul>
				</div>
			</li>
		</ul>
		<div class="tab-content">
			<div class="well">
				<div class="container-fluid">
					<div class="row-fluid">
						<div class="nav-header">
							<h1>${programName}</h1>
						</div>
						<dl class="dl-horizontal">
							<c:forEach var="entry" items="${xmlHeader}">
								<dt>${entry.key}</dt>
								<dd>${entry.value}</dd>
							</c:forEach>
						</dl>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="bottom-scripts.jspf"%>
</body>
</html>
