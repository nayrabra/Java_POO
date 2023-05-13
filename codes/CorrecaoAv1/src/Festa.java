
public class Festa {
	
	private String cpf;
	private int quantidade;
	private double custo;

	
	public Festa(String cpf, int quantidade, double custo) {
		this.cpf = cpf;
		this.quantidade = quantidade;
		this.custo = custo;
		
	}
	
	public String classifica() {
		if (quantidade < 300 && custo < 15000) {
			return "Festa junina"; 
		} else if (quantidade < 300 && custo >= 15000) {
			return "Aniversário";
		} else if (quantidade >= 300 && custo < 15000) {
			return "Formatura";
		} else {
			return "Casamento";
		}
	}
	
	
	public boolean possivelLocal(Local local) {
		if ((quantidade * 3/4.0) <= (local.tamanhoLocal())) {
			return true;
		} 
		return false;	
	}
	
	public String mostraFesta() {
		return "CPF do responsável: " + cpf + "\ncom: " + quantidade + " pessoas" + "\ncusto de: R$ " + custo + "\ntipo de festa: " + classifica();
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
}
