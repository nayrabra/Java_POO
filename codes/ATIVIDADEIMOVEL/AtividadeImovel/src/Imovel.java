
public class Imovel {
	int tipo;
	String nome;
	double tamanho;
	boolean ehNobre;
	int ano;
	double valor;
	
	public Imovel(int tipo, String nome, double tamanho, boolean ehNobre, int ano, double valor) {
		super();
		this.tipo = tipo;
		this.nome = nome;
		this.tamanho = tamanho;
		this.ehNobre = ehNobre;
		this.ano = ano;
		this.valor = valor;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
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
	public boolean isEhNobre() {
		return ehNobre;
	}
	public void setEhNobre(boolean ehNobre) {
		this.ehNobre = ehNobre;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public double calculaIPTU() {
		if (tipo == 2 && tamanho > 100) {
			return valor * 0.05;
		} else if (tipo == 2 && tamanho <= 100) {
			return valor * 0.02;
		} else if (tipo == 1 && tamanho > 100) {
			return valor * 0.03;
		} else {
			return valor * 0.01;
		}
	}
	
	
	public double valorDeVenda() {
		if (ehNobre && tamanho > 100) {
			return valor * 1.8;
		} else if (ehNobre && tamanho <= 100) {
			return valor * 1.1;
		} else if (!ehNobre && tamanho > 100) {
			return valor * 1.2;
		} else {
			return valor * 1.05;
		}
	}
	
	int anoAtual = 2023;
	public int idadeImovel() {
		return anoAtual - ano;
	}
	
	public void mostra() {
		if (tipo == 1) {
			System.out.println("Tipo do imóvel: casa");
		} else if (tipo == 2) {
			System.out.println("Tipo do imóvel: apartamento");
		} else {
			System.out.println("Erro! Digite 1 ou 2");
		}
		System.out.println("Proprietário: " + nome); 
		System.out.println("Tamanho: " + tamanho + " m²");
		if (ehNobre == true) {
			System.out.println("A área é nobre");
		} else {
			System.out.println("A área não é nobre");
		}
		System.out.println("Ano em que foi construído: " + ano); 
		System.out.println("Valor que foi comprado: R$ " + valor); 
		System.out.println("Valor a ser pago de IPTU: R$ " + calculaIPTU());
		System.out.println("Possível preço de venda: R$ " + valorDeVenda());
		System.out.println("Tempo de existência: " + idadeImovel() + " anos");
	}
	
}