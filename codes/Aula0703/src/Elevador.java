
public class Elevador {
	
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int pessoasDentro;
	
	public Elevador(int totalAndares, int capacidade) {
		this.andarAtual = 0;
		this.pessoasDentro = 0;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
	}
	
	public void entra() {
		if (pessoasDentro < capacidade) {
			setPessoasDentro(pessoasDentro+1);
		}
	}
	
	public void sai() {
		if (pessoasDentro > 0) {
			setPessoasDentro(pessoasDentro-1);
		}
	}
	
	public void sobe() {
		if (andarAtual < totalAndares) {
			setAndarAtual(andarAtual+1);
		}
	}
	
	public void desce() {
		if (andarAtual > 0) {
			setAndarAtual(andarAtual-1);
		}
	}
	
	public void mostra() {
		System.out.println("No andar " + andarAtual + " com " + pessoasDentro + " pessoas.");
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	private void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	private void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	private void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getPessoasDentro() {
		return pessoasDentro;
	}

	private void setPessoasDentro(int pessoasDentro) {
		this.pessoasDentro = pessoasDentro;
	}
	
	
}
