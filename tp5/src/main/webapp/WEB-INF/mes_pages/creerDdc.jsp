<%@page contentType="text/html"%>
<%@include file="/WEB-INF/mes_pages/include.jsp" %>

<html>
	<body>
		<h2>Créer une demande de congés</h2>
		
		<a href="http://localhost:8080/ddc/home">Retour</a>

		<br/><br/>
		Nous sommes le ${now}.
		<br/><br/>
		
		
		<br/><br/>
		
		<form:form modelAttribute="demandeConge">
			Type de congé : <form:select path="type" items="${typeDdc}"/> <br/>
			
			<br/>
			
			<table>
				<tr>
					<td width="200">
						<b>Période :</b>
					</td>
					<td width="200">
						Date début : 
					</td>
					<td width="200">
						Nombre de jours : 
					</td>
				</tr>
			</table>
			<br/> 
			<table>
				<tr>
					<td width="200">
						<b>Collaborateur :</b>
					</td>
					<td width="200">
						Prénom : 
					</td>
					<td width="200">
						Nom : 
					</td>
				</tr>
			</table>
			
			<br/>
						
			<input type="submit" value="Valider" />
			
		</form:form>

	</body>
</html>
