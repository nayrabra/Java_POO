import java.util.Objects;

public class Local {
	
	private double largura;
	private double comprimento;
	private boolean arLivre;
	
	public Local(double largura, double comprimento, boolean arLivre) {
		this.largura = largura;
		this.comprimento = comprimento;
		this.arLivre = arLivre;
	}
	
	//Object.equals só compara 2 objetos
	public boolean possivelFesta(Festa festa) {
		if (Objects.equals(festa.classifica(), "Festa junina") || Objects.equals(festa.classifica(), "Aniversário"))  {
			if (arLivre) {
				return true;
			} else {
				return false;
			} 
		} else if (Objects.equals(festa.classifica(), "Formatura") || Objects.equals(festa.classifica(), "Casamento")) {
			if (!arLivre) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	public double tamanhoLocal() {
		return largura * comprimento;
	}
	
	public String mostraLocal() {
		return "\nlargura: " + largura + " m" + "\ncomprimento: "  + comprimento + " m" + "\ntamanho do local: " + tamanhoLocal() + " m²" + "\nao ar livre: " + arLivre;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public boolean isArLivre() {
		return arLivre;
	}
	public void setArLivre(boolean arLivre) {
		this.arLivre = arLivre;
	}
	
}
