package concessionaria;

public class Carro extends Veiculo {
	
	private int nPortas;
	private boolean automatico;

	public Carro(boolean corMetalica, double valorFabricacao, int quantidade, int nPortas, boolean automatico) {
		super(corMetalica, valorFabricacao, quantidade);
		this.nPortas = nPortas;
		this.automatico = automatico;
	}

	public int getnPortas() {
		return nPortas;
	}

	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	@Override
	public double calculaValorVenda() {
		if (nPortas == 2 && !automatico) {
			return 1.17 * valorFabricacao;
		} else if (nPortas == 2 && automatico) {
			return 1.35 * valorFabricacao;
		} else if (nPortas == 4 && !automatico) {
			return 1.31 * valorFabricacao;
		} else {
			return 1.55 * valorFabricacao;
		}
	}
	

}
