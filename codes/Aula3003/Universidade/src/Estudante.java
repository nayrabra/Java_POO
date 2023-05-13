
public class Estudante {
	private String matricula;
	private int anoIngresso;
	private String curso;
	
	public double gastoComMaterial(int nFolhas) {
		return nFolhas * 0.10;
	}
	
	public Estudante(String matricula, int anoIngresso, String curso) {
		super();
		this.matricula = matricula;
		this.anoIngresso = anoIngresso;
		this.curso = curso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
