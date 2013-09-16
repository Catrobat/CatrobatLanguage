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
						<li class="active"><a href="#home" data-toggle="pill">1</a></li>
						<li><a href="#profile" data-toggle="pill">2</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#"> Dropdown 3-4 <b
								class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#messages" data-toggle="pill">3</a></li>
								<li><a href="#settings" data-toggle="pill">4</a></li>
							</ul></li>

					</ul>
				</div>
			</div>
			<div class="span10">
				<div class="well">
					<div class="tab-content">
						<div class="tab-pane active" id="home">1</div>
						<div class="tab-pane" id="profile">2</div>
						<div class="tab-pane" id="messages">3</div>
						<div class="tab-pane" id="settings">4</div>
					</div>
				</div>
			</div>
		</div>
	</div>




	<%@include file="bottom-scripts.jspf"%>
</body>
</html>
