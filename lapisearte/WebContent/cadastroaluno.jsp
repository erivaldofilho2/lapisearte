<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro aluno</title>
<link rel="stylesheet" type="text/css" href="css/estilo2.css">
</head>
<body>
		<c:import url="includes/menu.jsp"></c:import>
		
		<div class="centro">
		<form action="alunocontrole.do" method="post">
				<label class="titulo2">Dados do Aluno</label>
				<table>
					<tbody>
						<tr>
							<td><label > Nome completo:</label></td>
							<td><input type="text" size="40" name="txtNome" /></td>
							<td><label > Data Nascimento:</label></td>
							<td><input type="date" name="dateData" /></td>
							
							 <td><label for="nome">Sexo:</label></td>
							<td>
								<select name="txtSexo">
									<option value="M">M</option>
									<option value="F">F</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><label > Endereco:</label></td>
							<td><input type="text" size="40" name="txtEndereco" /></td>
							<td><label > Bairro:</label></td>
							<td><input type="text" name="txtBairro" size="20" /></td>
							 <td><label > CEP:</label></td>
							 <td><input type="text" name="txtCEP" /></td>
						</tr>
						<tr>
							<td><label > Cidade:</label></td>
							<td><input type="text" name="txtCidade" /></td>
							<td><label >UF:</label> </td>
							<td><input type="text" size="5" name="txtUF" /></td>
	
							<td><label for="curso"> Complemento:</label></td>
							<td><input type="text"  name="txtComplemento" /></td>
						</tr>


						<tr>
							<td><label> Telefone:</label></td>
							<td ><input type="text" name="txtTelefone" /> </td>
							<td><label > Celular:</label> </td>
							<td><input type="text" name="txtCelular" /></td>
							<td><label > Parentesco:</label> </td>
							<td><input type="text" name="txtParente" /></td>
						</tr>
						<tr>
							<td><label>E-mail:</label></td>
							<td ><input type="text" name="txtEmail" size="40px"/> </td>
							
						</tr>
					</tbody>
				</table>


				<label class="titulo2" >Filiacao</label>
				<table >
					<tbody>
						<tr>
							<td width="15px"><label> Mãe:</label></td>
							<td><input type="text" size="40" /></td>
							<td><label> Profissão</label></td>
							<td><input type="text" /></td>
						</tr>
						<tr>

							<td><label>RG:</label></td>
							<td><input type="text" /></td>
							<td><label>CPF:</label></td>
							<td><input type="text" /></td>
							<td><label>Telefone:</label></td>
							<td><input type="text" /></td>

						</tr>
						<tr><td colspan="6" align="center">----------------------------------------------------------------------</td></tr>

						<tr>
							<td width="600"><label for="curso"> Pai:</label></td>
							<td><input type="text" size="40" /></td>
							<td><label for="nome"> Profissão</label></td>
							<td><input type="text" /></td>
						</tr>
						<tr>
							<td><label>RG:</label></td>
							<td><input type="text" /></td>
							<td><label>CPF:</label></td>
							<td><input type="text" /></td>
							<td><label>Telefone:</label></td>
							<td><input type="text" /></td>
						</tr>
					</tbody>
				</table>
	
<!-- 			</fieldset> -->
			
<!-- 			<fieldset><table border="1px" ><tr><td width="1200px">teste</td><td width="1200px">teste</td></tr></table> </fieldset> -->
			<input type="submit" class="botao" value="Cadastrar" /> 
			<input type="reset" class="botao" value="Cancelar" />
		</form>
	</div>
</body>
</html>