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


			<li class="nav-header" id="xmlHeader"><h3>
					<a href="xmlHeader">Header</a>
				</h3></li>
			<li class="nav-header"><h3>ObjectList</h3></li>
			<li>
				<ul type="circle">
					<c:forEach var="entry" items="${objectNames}">
						<li id="${entry.value}"><a href="${entry.value}">${entry.key}</a></li>
					</c:forEach>
				</ul>
			<li>
			<li class="nav-header" id="variables"><h3>
					<a href="variables">Variables</a>
				</h3></li>

		</ul>
		<div class="tab-content">
			<div class="well">
				<div class="container-fluid">
					<div class="row-fluid">
						<div class="nav-header">
							<h2>${programName}</h2>
						</div>
						<c:choose>
							<c:when test="${activeTab == null}">
								<h2>Welcome to Catrobat Website!</h2>
							</c:when>
							<c:when test="${activeTab == 'xmlHeader'}">
								<dl class="dl-horizontal">
									<c:forEach var="entry" items="${xmlHeader}">
										<dt>${entry.key}</dt>
										<dd>${entry.value}</dd>
									</c:forEach>
								</dl>
							</c:when>
							<c:when test="${activeTab == 'variables'}">
								<ul type="circle">
									<c:forEach var="var" items="${variables}">
										<li>${var}</li>
									</c:forEach>
								</ul>
							</c:when>
							<c:otherwise>
								<h3>${name}</h3>
								
								<ul class="thumbnails">
									<c:forEach var="entry" items="${looks}">
										<li class="span4">
										<div class="thumbnail">
											<img src="${entry.value}" alt="" height="100px">
											<p>${entry.key}</p>
										</div>
									</li>
									</c:forEach>

								</ul>
								<pre> ${scripts} </pre>
								<hr>
								<ul type="circle">
									<c:forEach var="var" items="${variables}">
										<li>${var}</li>
									</c:forEach>
								</ul>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="bottom-scripts.jspf"%>
</body>
</html>
