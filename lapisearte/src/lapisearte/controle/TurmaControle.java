package lapisearte.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lapisearte.DAO.TurmaDAO;
import lapisearte.entidade.Turma;

/**
 * Servlet implementation class TurmaControle
 */
@WebServlet("/turmacontrole.do")
public class TurmaControle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TurmaControle() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamando metodo Post");

		Turma turma = new Turma(Integer.parseInt(request.getParameter("sala")),
								request.getParameter("serie"),
								request.getParameter("turma"),
								request.getParameter("professor"), 
								Integer.parseInt(request.getParameter("ano")), 
								Integer.parseInt(request.getParameter("capacidade")));
		
		TurmaDAO turDao = new TurmaDAO();

		turDao.inserir(turma);

		response.sendRedirect("index.jsp");

	}

}
