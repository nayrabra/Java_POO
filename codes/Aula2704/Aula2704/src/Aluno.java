
public class Aluno extends Pessoa {
	
	private int livrosAlugados;

	public Aluno(int idade, int livrosAlugados) {
		super(idade);
		this.livrosAlugados = livrosAlugados;
	}

	public int getLivrosAlugados() {
		return livrosAlugados;
	}

	public void setLivrosAlugados(int livrosAlugados) {
		this.livrosAlugados = livrosAlugados;
	}
	
	public int dobroLivrosAlugados() {
		return 2 * livrosAlugados;
	}
	
	public int triploIdade() {
		return 3 * idade;
	}

}
