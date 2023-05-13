
public abstract class Pessoa {
	
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	protected int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
