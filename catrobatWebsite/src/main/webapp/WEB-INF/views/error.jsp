<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<%@include file="top-scripts.jspf"%>
</head>
<body>
	<%@include file="header.jspf"%>
	<div class="hero-unit">
		<h3>${errorTitle}</h3>
		<div>${errorMsg}</div>
	</div>
</body>
</html>
