<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/estilo2.css">

<title>Cadastro turma</title>
</head>
<body>
	<c:import url="includes/menu.jsp"></c:import>

	<div  class="centro">
	<table >
		<tr>
			<td><label>Turma</label></td>
			<td><input type="text" /></td>
			<td>Capacidade</td>
			<td><input type="text" /></td>
			<td>Sala</td>
			<td><input type="text" /></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="radio" nome="teste" ><label>Primario</label></input>
			<input type="radio" nome="teste" ><label>Ginasio</label></input>
			</td>
			<td><label>Serie</label></td>
			<td><input type="text" /></td>
		</tr>
		<tr>
			<td><label>Professor</label></td>
			<td colspan="5"> <input type="text" />
<!-- 			<select name="professor" onfocus="alert(teste)"> -->
<!-- 				<option value="professor1">Professor 1</option> -->
<!-- 				<option value="professor2">Professor 2</option> -->
<!-- 			</select> -->
			</td>
		</tr>
	</table>
	</div>


</body>
</html>