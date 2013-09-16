<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<%@include file="top-scripts.jspf"%>
</head>
<body>
	<%@include file="header.jspf"%>


	<div class="tabbable tabs-left">
		<c:if test="${programName != null}">
			<ul class="nav nav-tabs nav-list">

				<li class="nav-header" id="xmlHeader"><a href="xmlHeader">Header</a></li>
				<li></li>
				<li class="nav-header">ObjectList</li>

				<c:forEach var="entry" items="${objectNames}">
					<li id="${entry.value}"><a href="${entry.value}">${entry.key}</a></li>
				</c:forEach>
				<li></li>
				<li id="variables" class="nav-header"><a href="variables">Variables</a>
				</li>
			</ul>
		</c:if>
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
								Please, upload your project.
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

								<div class=container>
									<div class="text-muted">
										<h4>Looks:</h4>
									</div>

									<ul class="thumbnails">
										<c:forEach var="entry" items="${looks}">
											<li><a href="${entry.value}"><img
													src="${entry.value}" alt="${entry.key}"
													title="${entry.key}" class="thumbnail img=rounded"
													height="140px" width="140px"> </a></li>
										</c:forEach>
									</ul>
								</div>
								<div class=container>
									<div class="text-muted">
										<h4>Sounds:</h4>
									</div>

									<ul class="thumbnails">
										<c:forEach var="entry" items="${sounds}">
											<li><a href="${entry.value}"> <img
													src="resources/play.png" width="48" class="img-circled"></a>
												${entry.key}</li>
										</c:forEach>
									</ul>

								</div>
								<div class=container>
									<div class="text-muted">
										<h4>Scripts:</h4>
									</div>

									<pre>${scripts}</pre>
								</div>
								<div class=container>
									<div class="text-muted">
										<h4>Variables:</h4>
									</div>

									<ul type="circle">
										<c:forEach var="var" items="${variables}">
											<li>${var}</li>
										</c:forEach>
									</ul>
								</div>
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
