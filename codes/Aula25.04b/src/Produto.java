
public abstract class Produto {
	
	private String nome;
	private double preco;
	private String codigo;
	
	public Produto(String nome, double preco, String codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
	}
	
	public boolean ehIgual(Produto p) {
		return codigo.equals(p.codigo);
	}

	public String getNome() {
		return nome;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void mostra() {
		System.out.println(preco);
		System.out.println(nome);
	}
	
}
