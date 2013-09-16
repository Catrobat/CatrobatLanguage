<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<%@include file="top-scripts.jspf"%>
</head>
<body>
	<%@include file="header.jspf"%>

	<c:choose>
		<c:when test="${programName == null}">
			<div class="hero-unit">
				<h2>Welcome to Catrobat Website!</h2>
				Please, upload your project.
			</div>
		</c:when>
		<c:otherwise>
			<div class="container-fluid">
				<div class="row">
					<div class="span2">
						<div class="well">
							<ul class="nav nav-tabs nav-stacked" id="myTab">
								<li class="active"><a href="#xmlHeader" data-toggle="pill">Header</a></li>

								<li class="dropdown"><a class="dropdown-toggle"
									data-toggle="dropdown" href="#" id="objectName">Object<b
										class="caret"></b></a>
									<ul class="dropdown-menu">
										<c:forEach var="entry" items="${objectNames}">
											<li><a href="#${entry.value}" data-toggle="pill">${entry.key}</a></li>
										</c:forEach>
									</ul></li>
								<li><a href="#variables" data-toggle="pill">Variables</a></li>

							</ul>
						</div>
					</div>
					<div class="span11">
						<div class="well">
							<div class="tab-content">
								<div class="tab-pane active" id="xmlHeader">
									<dl class="dl-horizontal">
										<c:forEach var="entry" items="${xmlHeader}">
											<dt>${entry.key}</dt>
											<dd>${entry.value}</dd>
										</c:forEach>
									</dl>
								</div>

								<c:forEach var="entry" items="${objects}">
									<div class="tab-pane" id="${entry.key}">
										<div class="span10">
											<div class="text-muted">
												<h4>Looks:</h4>
											</div>

											<ul class="thumbnails">
												<c:forEach var="look" items="${entry.value.looks}">
													<li><a href="${look.value}"><img
															src="${look.value}" alt="${look.key}" title="${look.key}"
															class="thumbnail img=rounded" height="140px"
															width="140px"> </a></li>
												</c:forEach>
											</ul>
										</div>
										<div class="span10">
											<div class="text-muted">
												<h4>Sounds:</h4>
											</div>

											<ul class="thumbnails">
												<c:forEach var="sound" items="${entry.value.sounds}">
													<li><a href="${sound.value}"> <img
															src="resources/play.png" width="48" class="img-circled"></a>
														${sound.key}</li>
												</c:forEach>
											</ul>

										</div>
										<div class="span10">
											<div class="text-muted">
												<h4>Scripts:</h4>
											</div>
											<pre>${entry.value.code}</pre>
										</div>
										<div class="span10">
											<div class="text-muted">
												<h4>Variables:</h4>
											</div>

											<ul type="circle">
												<c:forEach var="var" items="${entry.value.variables}">
													<li>${var}</li>
												</c:forEach>
											</ul>
										</div>
									</div>
								</c:forEach>

								<div class="tab-pane" id="variables">
									<ul type="circle">
										<c:forEach var="var" items="${variables}">
											<li>${var}</li>
										</c:forEach>
									</ul>
								</div>

							</div>
						</div>

					</div>
				</div>
			</div>
		</c:otherwise>
	</c:choose>




	<%@include file="bottom-scripts.jspf"%>
</body>
</html>
