
public class Carro {
	
	private int ano;
	private String cor;
	private String nome;
	private boolean licenciado;
	private String cpf;
	private String chassi;
	
	public Carro(int ano, boolean licenciado, String cor, String cpf, String chassi, String nome) {
		this.ano = Math.abs(ano); //valor absoluto, só aceita núm positivo
		this.licenciado = licenciado;
		this.cor = cor;
		this.cpf = cpf;
		this.chassi = chassi;
		this.nome = nome;
	}
	
	public Carro(int ano, boolean licenciado, String cor, String cpf, String nome) {
		this.ano = Math.abs(ano); 
		this.licenciado = licenciado;
		this.cor = cor;
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public void setAno(int ano) {//set modifica o valor do atributo, modificar utiliza o void
		this.ano = Math.abs(ano);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setLicenciado(boolean licenciado) {
		this.licenciado = licenciado;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getAno() { //o método é pub pq será acessado na principal
		return ano;
	}
	
	public boolean isLicenciado() {
		return licenciado;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {//set serve para modificar o valor de um atributo, modificar utiliza o void
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getChassi() {
		return chassi;
	}
	
	public int tempoCompra (int anoAtual) {
		return anoAtual - ano;
	}
}
