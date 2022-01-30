<%@page contentType="text/html"%>
<%@include file="/WEB-INF/mes_pages/include.jsp"%>

<html>
<body>
	<h2>Créer une demande de congés</h2>

	<a href="http://localhost:8080/ddc/home">Retour</a>

	<br />
	<br /> Nous sommes le ${now}.
	<br />
	<br />


	<br />
	<br />

	<form:form modelAttribute="demandeConge">
			Type de congé : <form:select path="type" items="${typeDdc}" />
		<br />

		<br />

		<table>
			<tr>
				<td width="200"><b>Période :</b></td>
			</tr>
			<tr>
				<td width="200">Date début :</td>
				<td><form:input path="dateDebut" /></td>
				<td><form:errors path="dateDebut" cssclass="error" /></td>
			</tr>
			<tr>
				<td width="200">Nombre de jours :</td>
				<td><form:input path="nbJours" /></td>
				<td><form:errors path="nbJours" cssclass="error" /></td>
			</tr>
		</table>
		<br />
		<table>
			<tr>
				<td width="200"><b>Collaborateur :</b></td>
			</tr>
			<tr>
				<td width="200">Prénom :</td>
				<td><form:input path="prenom" /></td>
				<td><form:errors path="prenom" cssclass="error" /></td>
			</tr>
			<tr>
				<td width="200">Nom :</td>
				<td><form:input path="nom" /></td>
				<td><form:errors path="nom" cssclass="error" /></td>
			</tr>
		</table>

		<br />

		<input type="submit" value="Valider" />

	</form:form>

</body>
</html>
