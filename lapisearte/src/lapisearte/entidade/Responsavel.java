package lapisearte.entidade;

import java.util.Date;

public class Responsavel {
	
	private String nome;
	private int RG;
	private int CPF;
	private Date dataNascimento;
	private String profissao;
	
	public Responsavel(String nome, int rG, int cPF, Date dataNascimento,
			String profissao) {
		super();
		this.nome = nome;
		RG = rG;
		CPF = cPF;
		this.dataNascimento = dataNascimento;
		this.profissao = profissao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRG() {
		return RG;
	}
	public void setRG(int rG) {
		RG = rG;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
}
