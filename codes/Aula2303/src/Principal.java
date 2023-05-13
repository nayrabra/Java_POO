
public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("343.434.434.34", "Rua X");
		
		Conta conta1 = new Conta(100.0, cliente1);
		
		conta1.imprimirConta();
		
		

	}

}
