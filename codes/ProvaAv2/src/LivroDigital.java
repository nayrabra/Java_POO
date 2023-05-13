
public class LivroDigital extends Livro {
	
	private int prazo;

	public LivroDigital(String titulo, String autor, int ano, int prazo) {
		super(titulo, autor, ano);
		this.prazo = prazo;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	@Override
	public boolean temDisponibilidade() {
		return true;
	}
	
}
