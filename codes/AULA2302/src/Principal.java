import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = 300;
		Produto[] prods = new Produto[n];
		
		
		for (int i = 0; i < n; i++) {
			prods[i] = new Produto();
			prods[i].codigo = s.nextLine();
			prods[i].valor = s.nextDouble();
			prods[i].peso = s.nextDouble();
		}
		
		int cnt1 = 0;
		for (int i = 0; i < n; i++) {
			if (prods[i].peso > 10 && prods[i].valor < 50) {
				cnt1++;
			}			
		}
		System.out.println(cnt1);
		
		double soma2 = 0;
		for (int i = 0; i < n; i++) {
			soma2 = soma2 + prods[i].peso;
		}
		System.out.println(soma2/n);
		
		int id3 = 0; 		
		for (int i = 0; i < n; i++) {
			if (prods[i].peso < prods[id3].peso) {
				id3 = i;
			}
		}
		prods[id3].mostra();
		
		int id4 = 0; 		
		for (int i = 0; i < n; i++) {
			if (prods[i].valor > prods[id4].valor) {
				id4 = i;
			}
		}
		prods[id4].mostra();
		
		double soma5 = 0;
		int cnt5 = 0;
		for (int i = 0; i < n; i++) {
			if (prods[i].peso > 10) {
				soma5 = soma5 + prods[i].valor;
				cnt5++;
			}
		}
		if (cnt5 > 0) {
			System.out.println(soma5/cnt5);
		} else {
			System.out.println("Não foram identificados produtos.");
		}
	}
}
