import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Conta c1 = new Conta();
		c1.cpf = "345.365.785-34";
		c1.id = 13;
		c1.saldo = 100.00;
		
		Conta c2 = new Conta();
		c1.cpf = "245.265.828-34";
		c1.id = 13;
		c1.saldo = 100.00;
		
		c1.transferir(70.00, c2);
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		
	}

}
