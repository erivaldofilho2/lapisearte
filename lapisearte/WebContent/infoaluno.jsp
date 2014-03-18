<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="lapisearte.entidade.Aluno"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="css/estilo2.css">
	<title>Informações do Aluno</title>
	</head>
	<body>
		<% Aluno aluno =  (Aluno) request.getAttribute("aluno"); %>
		
		<c:import url="includes/menu.jsp"></c:import>
		
		<h3>Aluno: <%=aluno.getNome()%></h3>
		
		<div class="centro">
			<div class="menu_esquerda">
		
		
		<a href="matriculacontrole.do?aluno=<%=aluno.getId()%>">Matricular</a>
		<a href="alunocontrole.do?acao=decl&id=<%=aluno.getId()%>">Declaracao</a>
		<a href="#">Historico</a>
		<a href="#">Ficha</a>
		<a href="#">Editar</a>
		<a href="#">Excluir</a>

		</div>
				<br><label class="titulo2">Geral</label><br>________________________________________________________________________________________<br><br>
				<table class="tb_info">
					
						<tr>
							<td class="tds">Matricula:</td><td><%=aluno.getId()%></td>
						</tr>
						<tr>
							<td class="tds">Inicio na escola:</td><td></td>
						</tr>
						<tr>
							<td class="tds">Aluno:</td><td><%=aluno.getNome()%></td>
						</tr>
						<tr>
							<td class="tds">Serie:</td><td></td>
						</tr>
						<tr>
							<td class="tds">Turma:</td><td></td>
						</tr>
						<tr>
							<td class="tds">Turno:</td><td></td>
						</tr>
					
				</table>

				<br><label class="titulo2">Contato</label><br>________________________________________________________________________________________<br><br>
				<table class="tb_info">
					
						<tr>
							<td class="tds">Nome:</td><td></td>
							<td class="tds">Grau de parentesco:</td><td></td>
						</tr>
						<tr>
							<td class="tds">Telefone:</td><td></td>
						</tr>
						<tr>
							<td class="tds">Celular:</td><td></td>			
						</tr>
						<tr>
							<td class="tds">Email:</td><td></td>
						</tr>
	
					
				</table>

				<br><label class="titulo2">Filiacao</label><br>________________________________________________________________________________________<br><br>
				<table class="tb_info">
					<tbody>
						<tr>
							<td class="tds">Mãe:</td><td></td>
						</tr>
						<tr>
							<td class="tds">Profissao:</td><td></td>
						</tr>
						<tr>
							<td class="tds">Telefone:</td><td></td>
						</tr>
						<tr>
							<td class="tds">Pai:</td><td></td>
						</tr>
						<tr>
							<td class="tds">Profissao:</td><td></td>
						</tr>
						<tr>
							<td class="tds">Telefone:</td><td></td>
						</tr>
					</tbody>
				</table>
	
				<br><label class="titulo2">Endereco</label><br><b>________________________________________________________________________________________</b><br><br>
				<table class="tb_info">
					<tbody>
						<tr>
							<td class="tds">Rua:</td><td><%=aluno.getEndereco().getRuaCasa() %></td>
						</tr>
						<tr>
							<td class="tds">Bairro:</td><td><%=aluno.getEndereco().getBairro()%></td>
							<td class="tds">Cidade:</td><td><%=aluno.getEndereco().getCidade() %></td>
							<td class="tds">UF:</td><td><%=aluno.getEndereco().getEstado() %></td>
							<td class="tds">CEP:</td><td><%=aluno.getEndereco().getCEP() %></td>				
						</tr>
						<tr>
							<td class="tds">Complemento:</td><td><%=aluno.getEndereco().getComplemento() %></td>
						</tr>
	
					</tbody>
				</table>
			<br>________________________________________________________________________________________
	</div>
	
	</body>
</html>