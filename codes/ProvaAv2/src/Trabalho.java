
public class Trabalho implements Acervo {
	
	private String titulo;
	private String tipo;
	private int qntExemplares;
	private int qntDisponivel;

	public Trabalho(String titulo, String tipo) {
		this.titulo = titulo;
		this.tipo = tipo;
		qntExemplares = 1;
		qntDisponivel = 1;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQntExemplares() {
		return qntExemplares;
	}

	public void setQntExemplares(int qntExemplares) {
		this.qntExemplares = qntExemplares;
	}

	public int getQntDisponivel() {
		return qntDisponivel;
	}

	public void setQntDisponivel(int qntDisponivel) {
		this.qntDisponivel = qntDisponivel;
	}
	
	public void emprestar() {
		if (qntDisponivel == 1) {
			qntDisponivel = 0;
		}
	}
	
	public void devolver() {
		if (qntDisponivel == 0)	{
			qntDisponivel = 1;
		}
	}

	@Override
	public boolean temDisponibilidade() {
		return qntDisponivel == 1;
	}

}
