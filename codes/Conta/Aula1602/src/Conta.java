
public class Conta {
	
	String cpf;
	int id;
	double saldo;
	boolean especial;
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	void sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
		}
	}
	
	double calculaBonus() {
		double bonus;
		if (especial == true) {
			bonus = 0.1 * saldo;
		} else {
			bonus = 0.05 * saldo;
		}
		return bonus;
	}
	
	void transferir(double valor, Conta c) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			c.saldo = c.saldo + valor;
		}
	}
	void mostra() {
		System.out.println("CPF da pessoa " + cpf);
		System.out.println("Identificador da pessoa " + id);
		System.out.println("Saldo da pessoa " + saldo);
	}
}
