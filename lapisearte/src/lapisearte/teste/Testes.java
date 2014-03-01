package lapisearte.teste;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JTextField;

import lapisearte.DAO.AlunoDAO;
import lapisearte.DAO.EnderecoDAO;
import lapisearte.DAO.UsuarioDAO;
import lapisearte.controle.CriaPDF;
import lapisearte.entidade.Aluno;
import lapisearte.entidade.Endereco;
import lapisearte.entidade.Usuario;

public class Testes {

	public static void main(String[] args) {

//		Calendar calendar = Calendar.getInstance();
//		calendar.set(Calendar.YEAR, 1990);
//		calendar.set(Calendar.MONTH, Calendar.OCTOBER);
//		calendar.set(Calendar.DATE, 15);
//
//		java.sql.Date data = new java.sql.Date(calendar.getTimeInMillis());
//
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		System.out.println(dateFormat.format(data)); // Imprime 04/10/1988


//
		AlunoDAO aluDAO = new AlunoDAO();

		ArrayList<Aluno> lista = aluDAO.buscaPorNome("Ju");

		for (Aluno aluno : lista) {

			System.out.println("ID: " + aluno.getId() + "\nNome: "
					+ aluno.getNome() + "\nData de Nascimento: "
					+ aluno.getDataNascimento() + "\n\n");

		}
		FileDialog salvararq = null;
		
		salvararq = new FileDialog(new Dialog(salvararq),"Salvando arquivo",FileDialog.SAVE);
		salvararq.setVisible(true);
		
		CriaPDF pdf = new CriaPDF();

		pdf.criarDeclaracao(lista.get(2),salvararq.getDirectory()+lista.get(2).getNome());

//		Endereco endereco = new Endereco("Rua da minha casa",
//				"Bairro da minha casa", 57061606, "Mcidade", "ME",
//				"Proximo a minha casa");
//		Aluno aluno = new Aluno("Figueira da Silva", "M", data, endereco, null,
//				null);
//		aluDAO.inserir(aluno);

	}
}