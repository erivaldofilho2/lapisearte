<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<%@page import="lapisearte.entidade.Aluno"%>
<%@page import="lapisearte.entidade.Turma"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/estilo2.css">
<script src="js/script.js" type="text/javascript"></script>

<title>Matricula Aluno</title>
</head>
<body>

	<%
		Aluno aluno =  (Aluno) request.getAttribute("aluno");
	%>
	<c:import url="includes/menu.jsp"></c:import>
	
	<div class="centro">
	<h3>
		Matricular aluno:<%=aluno.getNome()%> 
	</h3>
	Escolha a turma:
	<table class="lista">
		<tr bgcolor="#CCCCCC">
			<td><label class="titulo2">Turma</label></td>
			<td><label class="titulo2">Sala</label></td>
			<td><label class="titulo2">Professor</label></td>
			<td><label class="titulo2">Ano</label></td>
			<td><label class="titulo2"></label></td>
			
		</tr>

		<%
			ArrayList<Turma> lista = (ArrayList<Turma>) request.getAttribute("lista");
			int i = 1;
				for (Turma tur : lista) {
		%>

		<tr class="trs">
			<td><%=tur.getTurma()%></td>
			<td><%=tur.getSala()%></td>
			<td><%=tur.getProfessor()%></td>
			<td><%=tur.getAno()%></td>
			<td><input id="item<%= String.valueOf(i)%>" type="checkbox" value="<%=tur.getIdTurma()%>"/>  </td>
		</tr>
		<%
		i++;
			}
		%>

	</table>
		
		
		<input type="button" value="Matricular"  onclick="matricular()" /> 
	
	</div>


</body>
</html>