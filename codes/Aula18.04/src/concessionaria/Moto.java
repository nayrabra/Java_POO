package concessionaria;

public class Moto extends Veiculo {
	
	private int cilindradas;

	public Moto(boolean corMetalica, double valorFabricacao, int quantidade, int cilindradas) {
		super(corMetalica, valorFabricacao, quantidade);
		this.cilindradas = cilindradas;
	}

	@Override
	public double calculaValorVenda() {
		if (cilindradas < 500 && !corMetalica) {
			return 1.05 * valorFabricacao;
		} else if (cilindradas < 500 && corMetalica) {
			return 1.11 * valorFabricacao;
		} else if (cilindradas >= 500 && !corMetalica) {
			return 1.25 * valorFabricacao;
		} else {
			return 1.27 * valorFabricacao;
		}
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
}
