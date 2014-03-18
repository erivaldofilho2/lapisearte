package lapisearte.controle;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lapisearte.DAO.AlunoDAO;
import lapisearte.DAO.TurmaDAO;
import lapisearte.entidade.Aluno;
import lapisearte.entidade.Turma;

/**
 * Servlet implementation class MatriculaControle
 */
@WebServlet("/matriculacontrole.do")
public class MatriculaControle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MatriculaControle() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamando metodo get em matriculacontrole.do");
		
		int id = Integer.parseInt(request.getParameter("aluno"));
		AlunoDAO aluDao =  new AlunoDAO();
		Aluno aluno =  aluDao.buscaPorId(id);	
		request.setAttribute("aluno", aluno);
		
		TurmaDAO turDao = new TurmaDAO();
		ArrayList<Turma> lista = turDao.buscarTodas();
		request.setAttribute("lista", lista);
		
		RequestDispatcher saida = request
				.getRequestDispatcher("matriculaaluno.jsp");
		saida.forward(request, response);
		System.out.println(aluno);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
