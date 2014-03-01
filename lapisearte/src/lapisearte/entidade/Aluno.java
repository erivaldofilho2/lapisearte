package lapisearte.entidade;


public class Aluno {
	
	private int id;
	private String nome;
	private String sexo;
	private java.sql.Date dataNascimento;
	private Endereco endereco;
	private Responsavel responsavel;
	private Contato contato;
	
	public Aluno( String nome, String sexo, java.sql.Date dataNascimento,
			Endereco endereco, Responsavel responsavel, Contato contato) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.responsavel = responsavel;
		this.contato = contato;
	}
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public java.sql.Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(java.sql.Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Responsavel getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	
	
}
