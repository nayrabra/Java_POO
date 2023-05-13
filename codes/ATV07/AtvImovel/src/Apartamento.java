
public class Apartamento extends Imovel {
	
	private boolean piscina;

	public Apartamento(double area, int qtdQuartos, double preco, boolean piscina) {
		super(area, qtdQuartos, preco);
		this.piscina = piscina;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	@Override
	public double calculaPrecoVenda() {
		if (area > 300 && piscina == true) {
			return 1.5 * preco;
		}
		else {
			return 1.1 * preco;
		}
	}
	
	
	
}
