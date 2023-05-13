package empregados;

public class Presidente extends Funcionario {
	private int nAcoes;
	public Presidente(String nome, String cpf, double salario, int nAcoes) {
		super(nome, cpf, salario); //super vem de super classe, que nesse caso é o funcionario
		this.nAcoes = nAcoes;
	}
	public int getnAcoes() {
		return nAcoes;
	}
	public void setnAcoes(int nAcoes) {
		this.nAcoes = nAcoes;
	}
	
	@Override //método sobrescrito, esse método já existe em func
	public double calculaBonus() {
		return 0.10 * salario;
	}
	
	public void mostraPresidente() {
		System.out.println("Bonus do presidente " + calculaBonus());
	}
}
