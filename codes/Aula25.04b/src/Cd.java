
public class Cd extends Produto {
	
	private int faixas;

	public Cd(String nome, double preco, String codigo, int faixas) {
		super(nome, preco, codigo);
		this.faixas = faixas;
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	
	public void mostra() {
		super.mostra();
		System.out.println(faixas);
	}
	
}
