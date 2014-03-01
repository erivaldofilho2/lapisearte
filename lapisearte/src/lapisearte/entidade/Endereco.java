package lapisearte.entidade;

public class Endereco {

	private String ruaCasa;
	private String bairro;
	private int CEP;
	private String cidade;
	private String estado;
	private String complemento;
	
	public Endereco(String ruaCasa, String bairro, int CEP, String cidade,
			String estado, String complemento) {
		super();
		this.ruaCasa = ruaCasa;
		this.bairro = bairro;
		this.CEP = CEP;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
	}
	public Endereco(){
		
	}
	

	public String getRuaCasa() {
		return ruaCasa;
	}

	public void setRuaCasa(String ruaCasa) {
		this.ruaCasa = ruaCasa;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
