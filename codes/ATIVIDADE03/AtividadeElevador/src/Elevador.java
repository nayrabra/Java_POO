
public class Elevador {

	private int andarAtual;
	private int totalDeAndares;
	private int capacidadeMaxima;
	private int pessoasPresentes;
	private int entraPessoas;
	private int saiPessoas;
	private int sobeAndar;
	private int desceAndar;
	
	public Elevador(int capacidadeMaxima, int totalDeAndares) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.totalDeAndares = totalDeAndares;
		this.andarAtual = 0;
		this.pessoasPresentes = 0;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalDeAndares() {
		return totalDeAndares;
	}

	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public int getPessoasPresentes() {
		return pessoasPresentes;
	}

	public void setPessoasPresentes(int pessoasPresentes) {
		this.pessoasPresentes = pessoasPresentes;
	}

	public boolean entraPessoas (int pessoasPresentes, int capacidadeMaxima) {
		if (pessoasPresentes < 0) {
			return false;
		} else if (capacidadeMaxima < 1) {
			return false;
		} else if (pessoasPresentes >= 0 && capacidadeMaxima >= 1 && pessoasPresentes < capacidadeMaxima) {
			pessoasPresentes++;
			return true;
		} else if (pessoasPresentes > capacidadeMaxima) {
			return false;
		}
		return false;
	}

	public void saiPessoas (int pessoasPresentes, int capacidadeMaxima) {
		if (pessoasPresentes == 1) {
			pessoasPresentes--; 
		} else if (capacidadeMaxima < 1) {
			System.out.println("Não existe capacidade com número negativo, não entra ninguém.");
		} else if (pessoasPresentes > 0) {
			pessoasPresentes -= 2;
			System.out.println("Se sair uma pessoa, fica com " + pessoasPresentes + " pessoas."); //nao esta subtraindo
		} else if (pessoasPresentes < 0) {
			System.out.println("Não existe pessoas com número negativo, não sai ninguém.");
		} 
	}
	
	public void sobeAndar (int andarAtual, int totalDeAndares) {
		if (andarAtual < totalDeAndares) {
			andarAtual++;
			System.out.println("Se subir um andar, fica no " + andarAtual + "° andar.");
		} else if (andarAtual > totalDeAndares) {
			System.out.println("Erro. Andar atual maior que a quantidade de andares existentes no prédio.");
		} else if (andarAtual < 0 || totalDeAndares < 0) {
			System.out.println("Andar não existe, não sobe ninguém.");
		} 
	}
	
	public void desceAndar (int andarAtual, int totalDeAndares) {
		if (andarAtual == 1) {
			andarAtual--;
		} else if (andarAtual > totalDeAndares) {
			System.out.println("Erro. Andar atual maior que a quantidade de andares existentes no prédio.");
		} else if (andarAtual > 0) {
			andarAtual -= 2;
			System.out.println("Se descer um andar, fica no " + andarAtual + "° andar.");
		} else if (andarAtual < 0) {
			System.out.println("Andar não existe, não desce ninguém.");
		}
	}

	public int getEntraPessoas() {
		return entraPessoas;
	}

	public void setEntraPessoas(int entraPessoas) {
		this.entraPessoas = entraPessoas;
	}

	public int getSaiPessoas() {
		return saiPessoas;
	}

	public void setSaiPessoas(int saiPessoas) {
		this.saiPessoas = saiPessoas;
	}

	public int getSobeAndar() {
		return sobeAndar;
	}

	public void setSobeAndar(int sobeAndar) {
		this.sobeAndar = sobeAndar;
	}

	public int getDesceAndar() {
		return desceAndar;
	}

	public void setDesceAndar(int desceAndar) {
		this.desceAndar = desceAndar;
	}

}
