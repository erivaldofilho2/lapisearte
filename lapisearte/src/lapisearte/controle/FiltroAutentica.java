package lapisearte.controle;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FiltroAutentica
 */
@WebFilter(dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD }, urlPatterns = { "/*" })
public class FiltroAutentica implements Filter {

	public FiltroAutentica() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// Casting do HttpServletRequest
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		String url = httpServletRequest.getRequestURI();

		// capturando sessao
		HttpSession sessao = httpServletRequest.getSession();
		// Está logado
		if (sessao.getAttribute("usuLogado") != null
				|| url.lastIndexOf("login.html") > -1
				|| url.lastIndexOf("autcontrole.do") > -1
				|| url.lastIndexOf("css/estilo2.css")>-1
				|| url.lastIndexOf("img")>-1) {
			System.out.println("NAO FOI BARRADO");
			chain.doFilter(request, response);// permite o fluxo
		} else {
			// redireciona para login
			((HttpServletResponse) response).sendRedirect("login.html");
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
