package empregados;

public class Funcionario {
	private String nome;
	private String cpf;
	protected double salario; //protected é enxergado tbm na subclasse Presidente, e nao pode ser modificado na Principal
	
	public double calculaBonus() {
		return 0.05 * salario;
	}
	
	public void mostraFuncionario() {
		System.out.println("Nome: " + nome + 
				"\nCPF: " + cpf + 
				"\nSalario: " + salario +
				"\nBonus: " + calculaBonus());
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
}
