<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>TP Maven</title>

	<script src="js/jquery-3.2.1.min.js"></script>
	
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/bootstrap-grid.min.css" />
	<link rel="stylesheet" type="text/css"
		href="css/bootstrap-reboot.min.css" />
	<link rel="stylesheet"
		href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" />
	
	
	<script defer src="js/fontawesome-all.js"></script>
	<script src="https://code.jquery.com/ui/1.9.0/jquery-ui.js"
		integrity="sha256-BX2qlDN922gJsGwDJRhytK0MSxXflk+de/NR4ayQY8A="
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
		
	<%@ page import="java.util.List"%>
	<%@ page import="java.util.ArrayList"%>
	<%@ page import="servlets.*" %>
	<%@ page import="bo.MavenBO" %>
	<%@ page import="bo.VillesBO" %>
	<%@ page import="bo.VillesBOImpl" %>
	<%@ page import="model.Villes" %>
	<%
		VillesBO bo1 = new VillesBOImpl();
		List<Villes> villes = bo1.trouverVilles();
	%>
</head>
<body>
<h1>Contenu de la BDD La poste</h1>
<h1 class="text-center">Villes</h1>
	<form action="GetDistance" method="POST">
		<div class="row">
			<button type="submit" class="btn btn-primary">Calculer la
				distance entre les deux villes</button>
		</div>
		<br>

		<div class="row">
			<div class="col-md-12">
				<table id="table" class="table table-striped display">
					<thead>
						<tr>
							<th>code INSEE</th>
							<th>Nom</th>
							<th>Libellé</th>
							<th>Code postal</th>
							<th>Ligne 5</th>
							<th>Latitude</th>
							<th>Longitude</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
					<%
						int i = 0;
						for (i=0;i<10;i++){
							out.println("<tr>");
							out.println("<td>"+villes.get(i).getCodeCommuneINSEE()+"</td>");
							out.println("<td>"+villes.get(i).getNom_commune()+"</td>");
							out.println("<td>"+villes.get(i).getLibelle_acheminement()+"</td>");
							out.println("<td>"+villes.get(i).getCode_postal()+"</td>");
							out.println("<td>"+villes.get(i).getLigne_5()+"</td>");
							out.println("<td>"+villes.get(i).getCoordonnees().getLatitude()+"</td>");
							out.println("<td>"+villes.get(i).getCoordonnees().getLongitude()+"</td>");
							out.println("<td><input class='single-checkbox' type='checkbox' name='villes' value='"+villes.get(i).getCodeCommuneINSEE()+"'>");
							out.println("</tr>");
							}
						%>
					
					</tbody>
				</table>
			</div>
		</div>
	</form>
	<script src="js/bootstrap.min.js"></script>
	<script>
		$(document).ready(function() {
			$('#table').DataTable({});
		});
	</script>
	<script>
		var limit = 2;
		$('input.single-checkbox').on('change', function(evt) {
			if ($(this).siblings(':checked').length >= limit) {
				this.checked = false;
			}
		});
	</script>

</body>
</html>