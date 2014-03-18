<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   <header>
			<div class="top">
				<img width="65" height="65" src="img/logo.png" align="left">
				<div class="menu-top">
					<h1 class="titulo">Lapis e Arte</h1>
					<h3 class="titulo2">sistema web</h3>
				</div>
				<div align="right"> <a href="autcontrole.do"><label class="titulo2">Sair  .</label></a></div>
			</div>
			<div class="menu">
				<nav>
				
					<ul>
						<li><a href="index.jsp">Home</a>
						</li>
					</ul>
				
					<ul>
						<li><a href="#">Aluno</a>
							<ul>
								
								<li><a href="cadastroaluno.jsp">Cadastrar</a>
								<li><a href="alunocontrole.do?acao=listar">Listar</a>								
								<li><a href="#">opcao 3</a>
							
							</ul>
						</li>
					</ul>
		
					<ul>
						<li><a href="#">Professor</a>
							<ul>
								<li><a href="#">Cadastrar</a>
								<li><a href="#">Listar</a>
								<li><a href="#">opcao 3</a>
							
							</ul>
						</li>
					</ul>
					<ul>
						<li><a href="#">Turma</a>
							<ul>
								<li><a href="cadastroturma.jsp">Cadastrar</a>
								<li><a href="#">Listar</a>
								<li><a href="#">opcao 3</a>
							
							</ul>
						</li>
					</ul>
					</nav>
					
				</div>
		</header>