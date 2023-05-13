
public class Preguica extends Animal {
	
	private boolean seEscala;

	public Preguica(String nome, int ano, boolean ehDomestico, boolean seEscala) {
		super(nome, ano, ehDomestico);
		this.seEscala = seEscala;
	}
	
	public void emiteSom() {
		System.out.println("Som que emite: hannn hannn");
	}
	
	public void mostraAtributos() {
		System.out.println("\nBicho Preguica \nNome: " + getNome() +
				"\nAno de nascimento: " + getAno() + 
				"\nÉ domesticado? " + isEhDomestico() +
				"\nEscala? " + seEscala);
	}

	public boolean isSeEscala() {
		return seEscala;
	}

	public void setSeEscala(boolean seEscala) {
		this.seEscala = seEscala;
	}
	
	

}
