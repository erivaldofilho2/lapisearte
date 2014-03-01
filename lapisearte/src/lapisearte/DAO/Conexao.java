package lapisearte.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConnection() {

		Connection con = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bd_lapisearte", "root",
					"158030erivaldo");
			System.out.println("Conectado com sucesso!");

		} catch (SQLException e) {
			System.out.println("Erro ao conectar: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Driver nao encontrado.");
			e.printStackTrace();
		}
		return con;
	}
}
