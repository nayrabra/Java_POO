
public class Funcionario extends Pessoa {
	
	private double salario;
	
	public Funcionario(int idade, double salario) {
		super(idade);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double dobraSalario() {
		return 2 * salario;
	}
	
}
