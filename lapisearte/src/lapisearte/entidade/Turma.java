package lapisearte.entidade;

public class Turma {
	int idTurma;
	int sala;
	String serie;
	String turma;
	String professor;
	int ano;
	int capacidade;
	
	
	public Turma(int sala, String serie, String turma,
			String professor, int ano,int capacidade) {
		super();
		this.sala = sala;
		this.serie = serie;
		this.turma = turma;
		this.professor = professor;
		this.ano = ano;
		this.capacidade = capacidade;
	}
	public int getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getTurma() {
		return turma;
	}
	public void settTurma(String turma) {
		this.turma = turma;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
