package lapisearte.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import lapisearte.entidade.Aluno;
import lapisearte.entidade.Turma;

public class TurmaDAO {

	private Connection con = Conexao.getConnection();

	public void inserir(Turma turma) {

		// monta sql
		String sql = "INSERT INTO turma (sala,serie,turma,professor,ano,capacidade) Values (?,?,?,?,?,?)";
		// Controi prepared stement com sql
		try {

			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, turma.getSala());
			preparador.setString(2, turma.getSerie());
			preparador.setString(3, turma.getTurma());
			preparador.setString(4, turma.getProfessor());
			preparador.setInt(5, turma.getAno());
			preparador.setInt(6, turma.getCapacidade());
			preparador.execute();
			preparador.close();

			System.out.println("Turma Cadastrada com Sucesso");

		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar Turma");
			e.printStackTrace();
		}

	}

	public ArrayList<Turma> buscarTodas() {
		ArrayList<Turma> lista = new ArrayList<Turma>();

		String sql = "SELECT * FROM turma";

		try {

			PreparedStatement preparador = con.prepareStatement(sql);

			ResultSet resultado = preparador.executeQuery();

			while (resultado.next()) {

				Turma turma = new Turma(resultado.getInt("sala"),
										resultado.getString("serie"),
										resultado.getString("turma"),
										resultado.getString("professor"),
										resultado.getInt("ano"), 
										resultado.getInt("capacidade"));
				turma.setIdTurma(resultado.getInt("id_turma"));
				lista.add(turma);
			}
			
			preparador.close();

			System.out.println("Buscar todas as turmas!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		// return resultado;
		return lista;

	}

}
