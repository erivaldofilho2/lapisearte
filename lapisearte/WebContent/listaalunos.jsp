<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<%@page import="lapisearte.entidade.Aluno"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/estilo2.css">
		<script src="js/script.js" type="text/javascript"></script>
		<title>Lista Alunos</title>
	</head>
	<body>
	
	<c:import url="includes/menu.jsp"></c:import>
	
		<div class="centro">

			<input type="text"  name="txtBusca" id="valor" />
<!-- 			<a href="alunocontrole.do?acao=buscar">buscar</a> -->
			<input type="submit" onkeypress="pesquisa();" onclick="pesquisa();" value="Buscar" />
			
			<table class="lista">
				<tr bgcolor="#CCCCCC">
					<td><label class="titulo2">Matricula</label></td>
					<td><label class="titulo2">Nome</label></td>
					<td><label class="titulo2">Serie</label></td>
					<td><label class="titulo2">Turma</label></td>
					<td><label class="titulo2">Situação</label></td>
					<td><label class="titulo2">Abrir</label></td>
				</tr>
				<%
				@SuppressWarnings("unchecked")
				ArrayList<Aluno> lista = (ArrayList<Aluno>) request.getAttribute("lista");
					for (Aluno alu : lista) {
				%>
				<tr class="trs">
					<td><%=alu.getId()%></td>
					<td><%=alu.getNome()%></td>
					<td>nao consta</td>
					<td>"Z"</td>
					<td>regular</td>
					<td><a href="alunocontrole.do?acao=abrir&id=<%=alu.getId()%>">Abrir</a></td>
				</tr>
				<%
					}
				%>
			</table>
		</div>
	</body>
</html>