package lapisearte.entidade;

public class Contato {

	private int telefone1;
	private int celular;
	private String email;
	private String nomeContato;
	private String grauParentesco;
	private int telefone;
	
	public Contato(int telefone1, int celular, String email,
			String nomeContato, String grauParentesco, int telefone) {
		super();
		this.telefone1 = telefone1;
		this.celular = celular;
		this.email = email;
		this.nomeContato = nomeContato;
		this.grauParentesco = grauParentesco;
		this.telefone = telefone;
	}
	public int getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(int telefone1) {
		this.telefone1 = telefone1;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public String getGrauParentesco() {
		return grauParentesco;
	}
	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
}
