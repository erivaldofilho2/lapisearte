package lapisearte.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import lapisearte.DAO.Conexao;
import lapisearte.entidade.Aluno;
import lapisearte.entidade.Endereco;

public class AlunoDAO {

	private Connection con = Conexao.getConnection();

	public void inserir(Aluno aluno) {

		// monta sql
		String sql = "INSERT INTO aluno (nome,data_nascimento,sexo,fk_endereco) Values (?,?,?,?)";
		// Controi prepared stement com sql
		try {
			// inserindo Endereco
			int i = 0;
			EnderecoDAO ende = new EnderecoDAO();
			ende.inserir(aluno.getEndereco());
			i = ende.getUltimoId();

			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, aluno.getNome());
			preparador.setDate(2, aluno.getDataNascimento());
			preparador.setString(3, aluno.getSexo());
			preparador.setInt(4, i);

			preparador.execute();
			preparador.close();

			System.out.println("Aluno cadastrado com sucesso!");

		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar Aluno!");
			e.printStackTrace();
		}

	}

	public void deletar(Aluno aluno) {
		// monta sql
		String sql = "DELETE FROM aluno WHERE id_aluno=?";
		// Controi prepared stement com sql
		try {

			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, aluno.getId());

			preparador.execute();
			preparador.close();

			System.out.println("Aluno deletado com sucesso!");

		} catch (SQLException e) {
			System.out.println("Erro ao deletar aluno!");
			e.printStackTrace();
		}
	}

	public ArrayList<Aluno> buscarTodos() {
		ArrayList<Aluno> lista = new ArrayList<Aluno>();

		String sql = "SELECT * FROM aluno";

		try {

			PreparedStatement preparador = con.prepareStatement(sql);

			ResultSet resultado = preparador.executeQuery();

			while (resultado.next()) {

				Aluno aluno = new Aluno();
				aluno.setId(resultado.getInt("id_aluno"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setDataNascimento(resultado.getDate("data_nascimento"));
				aluno.setSexo(resultado.getString("sexo"));

				lista.add(aluno);
			}
			preparador.close();

			System.out.println("Buscar todos os aluno!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		// return resultado;
		return lista;

	}

	public Aluno buscaPorId(int id) {
		Aluno aluno = null;
		String sql = "SELECT * FROM aluno WHERE id_aluno=?";
		// Constroi prepared stement com sql
		try {
			Endereco endereco = new Endereco();
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, id);

			ResultSet resultado = preparador.executeQuery();

			if (resultado.next()) {

				aluno = new Aluno();
				aluno.setId(resultado.getInt("id_aluno"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setDataNascimento(resultado.getDate("data_nascimento"));
				aluno.setSexo(resultado.getString("sexo"));

			}
			// preparador.close();

			sql = "SELECT rua,bairro,cidade,estado,cep,complemento "
					+ "FROM endereco INNER JOIN aluno  "
					+ "WHERE endereco.id_endereco = aluno.fk_endereco AND aluno.id_aluno = ?";

			preparador = con.prepareStatement(sql);
			preparador.setInt(1, id);
			resultado = preparador.executeQuery();
			if (resultado.next()) {

				endereco.setRuaCasa(resultado.getString("rua"));
				endereco.setBairro(resultado.getString("bairro"));
				endereco.setCidade(resultado.getString("cidade"));
				endereco.setEstado(resultado.getString("estado"));
				endereco.setCEP(resultado.getInt("cep"));
				endereco.setComplemento(resultado.getString("complemento"));
			}
			preparador.close();

			aluno.setEndereco(endereco);

		} catch (SQLException e) {
			System.out.println("Erro ao consultar aluno por ID :/");
			e.printStackTrace();
		}
		return aluno;
	}

	/**
	 * Buscar aluno por palavra Retorna um array com os alunos encontrados
	 */
	public ArrayList<Aluno> buscaPorNome(String nome) {
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		String sql = "SELECT * FROM aluno WHERE nome LIKE  '"+nome+"%'";
		try {

			PreparedStatement preparador = con.prepareStatement(sql);

//			preparador.setString(1, nome);

			ResultSet resultado = preparador.executeQuery();
			
			while (resultado.next()) {

				Aluno aluno = new Aluno();
				aluno.setId(resultado.getInt("id_aluno"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setDataNascimento(resultado.getDate("data_nascimento"));
				aluno.setSexo(resultado.getString("sexo"));

				lista.add(aluno);
			}
			preparador.close();
			
			System.out.println("Buscar alunos por nome!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
}
