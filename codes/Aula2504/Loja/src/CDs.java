
public class CDs extends ProdutosLoja{

	private int nFaixas;

	public CDs(String nome, double preco, String codigo, int nFaixas) {
		super(nome, preco, codigo);
		this.nFaixas = nFaixas;
	}

	public int getnFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}
	
	@Override
	public void mostra() {
		super.mostra();
		System.out.println("Numero de faixas: " + nFaixas);
	}
	
	
	
}
