
public class Livro extends Produto {
	
	private String autor;

	public Livro(String nome, double preco, String codigo, String autor) {
		super(nome, preco, codigo);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void mostra() {
		super.mostra();
		System.out.println(autor);
	}
	
}
