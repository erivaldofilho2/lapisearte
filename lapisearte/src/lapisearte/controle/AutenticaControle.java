package lapisearte.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lapisearte.DAO.UsuarioDAO;
import lapisearte.entidade.Usuario;

@WebServlet("/autcontrole.do")
public class AutenticaControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AutenticaControle() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("metodo get");
		HttpSession sessao = request.getSession(false);
		if(sessao != null){
			sessao.invalidate();
		}
		response.sendRedirect("login.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Chamando metodo Post");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Usuario usuario =  new Usuario(login, senha);
		
		UsuarioDAO usuDao = new UsuarioDAO();
		
		System.out.println(usuDao.autenticar(usuario));
		
		if(!usuDao.autenticar(usuario)){
			response.sendRedirect("login.html");
		}else{
			//criando sessao
			HttpSession sessao = request.getSession();
			sessao.setMaxInactiveInterval(3000);
			sessao.setAttribute("usuLogado", usuario);
			response.sendRedirect("index.jsp");
		}
	}

}
