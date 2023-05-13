
public class Cachorro extends Animal {
	
	private boolean seCorre;
	
	public Cachorro (String nome, int ano, boolean ehDomestico, boolean seCorre) {
		super(nome, ano, ehDomestico);
		this.seCorre = seCorre;
	}
	
	public void emiteSom() {
		System.out.println("Som que emite: au au");
	}
	
	public void mostraAtributos() {
		System.out.println("Cachorro \nNome: " + getNome() +
				"\nAno de nascimento: " + getAno() + 
				"\nÉ domesticado? " + isEhDomestico() +
				"\nCorre? " + seCorre);
	}

	public boolean isSeCorre() {
		return seCorre;
	}

	public void setSeCorre(boolean seCorre) {
		this.seCorre = seCorre;
	}
	
	
	

}
