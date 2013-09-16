<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<%@include file="top-scripts.jspf"%>
</head>
<body>
	<%@include file="header.jspf"%>
	<div class="container">
		<div class="row">
			<div class="span2">
				<div class="well">
					<ul class="nav nav-tabs nav-stacked" id="myTab">
						<li><a href="#xmlHeader" data-toggle="pill">Header</a></li>

						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Object<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<c:forEach var="entry" items="${objectNames}">
									<li><a href="#${entry.value}" data-toggle="pill">${entry.key}</a></li>
								</c:forEach>
							</ul></li>
						<li><a href="#variables" data-toggle="pill">Variables</a></li>

					</ul>
				</div>
			</div>
			<div class="span10">
				<div class="well">
					<div class="tab-content">
						<div class="tab-pane" id="xmlHeader">1</div>
						<div class="tab-pane" id="variables">2</div>

					</div>
				</div>
			</div>
		</div>
	</div>




	<%@include file="bottom-scripts.jspf"%>
</body>
</html>
