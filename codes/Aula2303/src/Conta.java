
public class Conta {
	
	private Cliente cliente;
	private double saldo;
	
	public Conta (double saldo, Cliente cliente) {
		this.saldo = saldo;
		this.cliente = cliente;
		if (saldo < 0) {
			this.saldo = 0;
		}
	}
	
	public void imprimirConta() {
		cliente.imprimirCliente();
		System.out.println("Saldo do cliente " + saldo);
	}
	
	public void fazOperacao(Operacao operacao) {
		if (operacao.getTipo() == 'D') {
			this.saldo += operacao.getValor();
		} if (operacao.getTipo() == 'R') {
			this.saldo -= operacao.getValor();
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
