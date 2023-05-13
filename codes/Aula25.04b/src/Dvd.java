
public class Dvd extends Produto {
	
	private int duracao;

	public Dvd(String nome, double preco, String codigo, int duracao) {
		super(nome, preco, codigo);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public void mostra() {
		super.mostra();
		System.out.println(duracao);
	}

}
