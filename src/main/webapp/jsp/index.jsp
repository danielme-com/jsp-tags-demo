<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="dm" uri="/WEB-INF/dm.tld"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP TAGS DEMO</title>

</head>

<body>

	<h2>Implementación de etiquetas en JSP</h2>
	<dm:helloWorld />
	<br />
	<dm:printText cadenaObligatoria="cadena obligatoria normal" />
	<br />
	<dm:printText cadenaObligatoria="cadena obligatoria en negrita" bold="true" />
	<br />
	<dm:printText cadenaObligatoria="el id de la sesión es: ${pageContext.session.id}" />
	<br />
	<dm:toUpperCase>
		<dm:printText cadenaObligatoria="cadena de prinText convertida a mayúsculas por toUpperCase" />
	</dm:toUpperCase>
	<br />
	<dm:printList>
		<dm:listElement value="elemento 1 de la lista" />
		<dm:listElement value="elemento 2 de la lista" />
	</dm:printList>
</body>

</html>