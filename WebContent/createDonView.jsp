<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Product</title>
</head>
<body>
	<div>
		<a href="login">Déconnexion</a>
		<a href="userInfo">Profil</a>
	</div>
	
	<h3>Faire un don</h3>

	<p style="color: red;">${errorString}</p>

	<form method="POST"
		action="${pageContext.request.contextPath}/create_don">
		<table border="0">
			<tr>
				<td>Mode de réglement</td>
				<td><input type="text" name="mode_reglement" value="${don.mode_reglement}" /></td>
			</tr>
			<tr>
				<td>Montant</td>
				<td><input type="text" name="montant" value="${don.montant}" /></td>
			</tr>
			<tr>
				<td>Quantite</td>
				<td><input type="text" name="quantite" value="${don.quantite}" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /> <a
					href="donList">Cancel</a></td>
			</tr>
		</table>
	</form>

</body>
</html>