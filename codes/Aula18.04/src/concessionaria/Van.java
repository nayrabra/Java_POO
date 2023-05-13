package concessionaria;

public class Van extends Veiculo {
	
	private int nAssentos;
	private double peso;

	public Van(boolean corMetalica, double valorFabricacao, int quantidade, int nAssentos, double peso) {
		super(corMetalica, valorFabricacao, quantidade);
		this.nAssentos = nAssentos;
		this.peso = peso;
	}

	@Override
	public double calculaValorVenda() {
		if (nAssentos < 7 && peso < 1000) {
			return 1.12 * valorFabricacao;
		} else if (nAssentos < 7 && peso >= 1000) {
			return 1.19 * valorFabricacao;
		} else if (nAssentos >= 7 && peso < 1000) {
			return 1.35 * valorFabricacao;
		} else {
			return 1.47 * valorFabricacao;
		}
	}

	public int getnAssentos() {
		return nAssentos;
	}

	public void setnAssentos(int nAssentos) {
		this.nAssentos = nAssentos;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
