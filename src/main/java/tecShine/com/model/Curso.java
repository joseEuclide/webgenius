package tecShine.com.model;

public class Curso {

	
	private int id;
	private String nome;
	private String professor;
	private String lancou;
	private int cargaHoraria;
	private int preco;
	private boolean inserir_Disciplinas;
	private String coord;
	private int qProfs;
	private int qAlunos;
	private int telefone;
	
	
	
	
	
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getLancou() {
		return lancou;
	}
	public void setLancou(String lancou) {
		this.lancou = lancou;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getqProfs() {
		return qProfs;
	}
	public void setqProfs(int qProfs) {
		this.qProfs = qProfs;
	}
	public int getqAlunos() {
		return qAlunos;
	}
	public void setqAlunos(int qAlunos) {
		this.qAlunos = qAlunos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoord() {
		return coord;
	}
	public void setCoord(String coord) {
		this.coord = coord;
	}
	public boolean isInserir_Disciplinas() {
		return inserir_Disciplinas;
	}
	public void setInserir_Disciplinas(boolean inserir_Disciplinas) {
		this.inserir_Disciplinas = inserir_Disciplinas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
}
