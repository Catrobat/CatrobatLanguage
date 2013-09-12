<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<script type="text/javascript"
	src="http://scriptjava.net/source/scriptjava/scriptjava.js"></script>
<script type="text/javascript">
	function SendFile() {
		$$f({
			formid : 'upload_form',
			url : 'upload',
			onstart : function() {
				$$('result', 'start uploading');
			},
			onsend : function() {
				$$('result', $$('result').innerHTML + '<br />success');
			}
		});
	}
</script>
</head>
<body>
	<h1>Hello world!</h1>
	<form id="upload_form" method="post" enctype="multipart/form-data"
		onSubmit="">
		<input class="file_form" type="file" name="upload_file" />
	</form>
	<br />
	<div id="result">Status</div>
	<br />
	<br />
	<div onclick="SendFile();">Upload file</div>
	<br />
</body>
</html>
