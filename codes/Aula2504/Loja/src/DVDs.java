
public class DVDs  extends ProdutosLoja {
	
	private int duracao;

	public DVDs(String nome, double preco, String codigo, int duracao) {
		super(nome, preco, codigo);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public void mostra() {
		super.mostra();
		System.out.println("Duracao: " + duracao);
	}
	
}
