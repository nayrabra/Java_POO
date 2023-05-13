
public class LivroFisico extends Livro {
	
	private int qntExemplares;
	private int qntDisponivel;

	public LivroFisico(String titulo, String autor, int ano, int qnt) {
		super(titulo, autor, ano);
		qntExemplares = qnt;
		qntDisponivel = qnt;
	}

	public int getQntExemplares() {
		return qntExemplares;
	}

	public void setQntExemplares(int qntExemplares) {
		this.qntExemplares = qntExemplares;
	}

	public int getQntDisponivel() {
		return qntDisponivel;
	}

	public void setQntDisponivel(int qntDisponivel) {
		this.qntDisponivel = qntDisponivel;
	}
	
	public void emprestar() {
		if (qntDisponivel > 0) {
			qntDisponivel--;
		}
	}
	
	public void devolver() {
		if (qntDisponivel < qntExemplares)	{
			qntDisponivel++;
		}
	}

	@Override
	public boolean temDisponibilidade() {
		return qntDisponivel > 0;
	}

}
