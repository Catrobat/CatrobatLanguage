<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<%@include file="top-scripts.jspf"%>
</head>
<body>
	<%@include file="header.jspf"%>
	<ul class="nav nav-tabs" id="myTab">
		<li class="active"><a href="#home" data-toggle="tab">1</a></li>
		<li><a href="#profile" data-toggle="tab">2</a></li>
		<li><a href="#messages" data-toggle="tab">3</a></li>
		<li><a href="#settings" data-toggle="tab">4</a></li>
	</ul>

	<div class="tab-content">
		<div class="tab-pane active" id="home">1</div>
		<div class="tab-pane" id="profile">2</div>
		<div class="tab-pane" id="messages">3</div>
		<div class="tab-pane" id="settings">4</div>
	</div>

	<%@include file="bottom-scripts.jspf"%>
</body>
</html>
