package lapisearte.controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lapisearte.DAO.AlunoDAO;
import lapisearte.entidade.Aluno;
import lapisearte.entidade.Endereco;

@WebServlet("/alunocontrole.do")
public class AlunoControle extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AlunoControle() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamando metodo GET");
		String acao = request.getParameter("acao");
		AlunoDAO aluDao = new AlunoDAO();

		if (acao != null && acao.equals("abrir")) {

			Aluno aluno = aluDao.buscaPorId(Integer.parseInt(request
					.getParameter("id")));
			request.setAttribute("aluno", aluno);
			RequestDispatcher saida = request
					.getRequestDispatcher("infoaluno.jsp");
			saida.forward(request, response);
			System.out.println("Enviado os dados do aluno!!");

		} else if (acao != null && acao.equals("listar")) {

			// 1 - obter a lista
			ArrayList<Aluno> lista = aluDao.buscarTodos();
			// 2 - colocar lista no request

			request.setAttribute("lista", lista);

			// encaminhamento ao JSP

			RequestDispatcher saida = request
					.getRequestDispatcher("listaalunos.jsp");

			saida.forward(request, response);
		} else if (acao != null && acao.equals("buscar")) {

			String nome = request.getParameter("nome");
			System.out.println("Nome = " + nome);
			// 1 - obter a lista
			ArrayList<Aluno> lista = aluDao.buscaPorNome(nome);
			// 2 - colocar lista no request

			request.setAttribute("lista", lista);

			// encaminhamento ao JSP

			RequestDispatcher saida = request
					.getRequestDispatcher("listaalunos.jsp");

			saida.forward(request, response);

		} else if (acao != null && acao.equals("decl")) {
			
			CriaPDF pdf = new CriaPDF();
			
			pdf.criarDeclaracao(aluDao.buscaPorId(Integer.parseInt(request.getParameter("id"))));

			 
			 
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Chamando metodo Post");
		// tratamento da data
		String s = request.getParameter("dateData");
		String data[] = s.split("-");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, Integer.parseInt(data[0]));
		calendar.set(Calendar.MONTH, Integer.parseInt(data[1]));
		calendar.set(Calendar.DATE, Integer.parseInt(data[2]));

		java.sql.Date data2 = new java.sql.Date(calendar.getTimeInMillis());

		Endereco endereco = new Endereco(request.getParameter("txtEndereco"),
				request.getParameter("txtBairro"), Integer.parseInt(request
						.getParameter("txtCEP")),
				request.getParameter("txtCidade"),
				request.getParameter("txtUF"),
				request.getParameter("txtComplemento"));

		Aluno aluno = new Aluno(request.getParameter("txtNome"),
				request.getParameter("txtSexo"), data2, endereco, null, null);

		AlunoDAO aluDao = new AlunoDAO();
		aluDao.inserir(aluno);

		System.out.println("cadastrado com sucesso");
		PrintWriter saida = response.getWriter();
		saida.println("Aluno: " + request.getParameter("txtNome")
				+ ", cadastrador com sucesso!");
	}

}
