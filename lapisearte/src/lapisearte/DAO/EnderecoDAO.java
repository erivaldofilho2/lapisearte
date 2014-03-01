package lapisearte.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lapisearte.entidade.Endereco;

public class EnderecoDAO {

	private Connection con = Conexao.getConnection();

	public void inserir(Endereco endereco) {
		String sql = "";

		try {

			PreparedStatement preparador;
			sql = "INSERT INTO endereco (rua,bairro,cep,cidade,estado,complemento) Values (?,?,?,?,?,?)";

			preparador = con.prepareStatement(sql);
			preparador.setString(1, endereco.getRuaCasa());
			preparador.setString(2, endereco.getBairro());
			preparador.setInt(3, endereco.getCEP());
			preparador.setString(4, endereco.getCidade());
			preparador.setString(5, endereco.getEstado());
			preparador.setString(6, endereco.getComplemento());

			preparador.execute();
			preparador.close();

			System.out.println("Endereco cadastrado com sucesso em DAO!");

		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar Aluno!");
			e.printStackTrace();
		}
	}

	public int getUltimoId(){
		int i=0;
		
		PreparedStatement preparador;
		String sql = "SELECT MAX(id_endereco) FROM endereco";
		try {
			preparador = con.prepareStatement(sql);
			ResultSet rs = preparador.executeQuery();
			if (rs.next()) {
				i = rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("Não foi possivel pegar ultimo endereco inserido");
			e.printStackTrace();
		}
		return i;
	}
}
