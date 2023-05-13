
public class Bola {
	
	private String cor;
	private double peso;
	
	public Bola(String cor, double peso) {
		this.cor = cor;
		this.peso = peso;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean equals(Object ob) { //quando quiser verificar se uma lista contem as mesmas caract de um obj tem que implementar o metodo equals
		Bola b = (Bola)ob;
		return cor.equals(b.cor) && peso == b.peso;
	}
}
