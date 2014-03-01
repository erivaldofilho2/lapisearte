package lapisearte.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lapisearte.entidade.Usuario;

public class UsuarioDAO {

	private Connection con = Conexao.getConnection();

	public boolean autenticar(Usuario usuario) {
		boolean valor = false;
		Usuario usuresult = new Usuario(null, null);

		String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
		try {

			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getLogin());
			preparador.setString(2, usuario.getSenha());

			ResultSet resultado = preparador.executeQuery();
			if (resultado.next()) {
				usuresult.setLogin(resultado.getString("login"));
				usuresult.setSenha(resultado.getString("senha"));
				System.out.println("aqui= " + resultado.getString("login"));
				valor = true;
			}

		} catch (SQLException e) {
			System.out.println("Erro de altenticacao!");
			e.printStackTrace();
		}
		return valor;

	}
}
