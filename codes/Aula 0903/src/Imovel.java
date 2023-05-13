
public class Imovel {
	private int tipoDeImovel;
	private String nome;
	private double tamanho;
	private boolean areaNobre;
	private int anoDaCompra;
	private double valor;
	
	public int getTipoDeImovel() {
		return tipoDeImovel;
	}

	public void setTipoDeImovel(int tipoDeImovel) {
		this.tipoDeImovel = tipoDeImovel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isAreaNobre() {
		return areaNobre;
	}

	public void setAreaNobre(boolean areaNobre) {
		this.areaNobre = areaNobre;
	}

	public int getAnoDaCompra() {
		return anoDaCompra;
	}

	public void setAnoDaCompra(int anoDaCompra) {
		this.anoDaCompra = anoDaCompra;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	

	public int calculaIdade(int anoAtual) {
		return anoAtual - anoDaCompra;
	}
	

	public Imovel (int tipoDeImovel, String nome, double tamanho, boolean areaNobre, int anoDaCompra, double valor) {
		this.tipoDeImovel = tipoDeImovel;
		this.nome = nome;
		this.tamanho = tamanho;
		this.areaNobre = areaNobre;
		this.anoDaCompra = anoDaCompra;
		this.valor = valor;
	}
		
		public double calculaIPTU() {
			if (tipoDeImovel == 2 && tamanho > 100) {
				return valor * 0.05;
			} else if (tipoDeImovel == 2 && tamanho <= 100) {
				return valor * 0.02;
			} else if (tipoDeImovel == 1 && tamanho > 100) {
				return valor * 0.03;
			} else {
				return valor * 0.01;
			}
			
		}
		
		public double calculaVenda( ) {
			if (areaNobre == true && tamanho > 100) {
				return valor * 1.8;
			} else if (areaNobre == true && tamanho <= 100) {
				return valor * 1.1;
			} else if (areaNobre == false && tamanho > 100) {
				return valor * 1.2;
			} else {
				return valor * 1.05;
			}
		}
		
		public void mostra() {
			if (tipoDeImovel == 1) {
				System.out.println("Tipo: casa");
			} else if (tipoDeImovel == 2) {
				System.out.println("Tipo: apartamento");
			}
			System.out.println("Nome: " + nome);
			System.out.println("Tamanho: " + tamanho + " metros quadrados.");
			System.out.println("Possível valor de venda: " + calculaVenda());
			System.out.println("Valor a ser pago de IPTU: " + calculaIPTU());
			
		}
		
		
}
