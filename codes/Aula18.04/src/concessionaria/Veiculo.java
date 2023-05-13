package concessionaria;

public abstract class Veiculo {
	
	protected boolean corMetalica;
	protected double valorFabricacao;
	private int quantidade;
	
	public Veiculo(boolean corMetalica, double valorFabricacao, int quantidade) {
		this.corMetalica = corMetalica;
		this.valorFabricacao = valorFabricacao;
		this.quantidade = quantidade;
	}
	
	public abstract double calculaValorVenda();
	
	public double calculaValorSeguro() {
		return 0.05 * calculaValorVenda();
	}

	public boolean isCorMetalica() {
		return corMetalica;
	}

	public void setCorMetalica(boolean corMetalica) {
		this.corMetalica = corMetalica;
	}

	public double getValorFabricacao() {
		return valorFabricacao;
	}

	public void setValorFabricacao(double valorFabricacao) {
		this.valorFabricacao = valorFabricacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
