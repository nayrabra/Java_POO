import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de festas:");
		int n = s.nextInt();
		Festa[] festas = new Festa [n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("CPF do responsável:");
			String cpf = s.next();
			System.out.println("Quantidade de pessoas:");
			int quantidade = s.nextInt();
			System.out.println("Quanto de custo:");
			double custo = s.nextDouble();
			festas[i] = new Festa (cpf, quantidade, custo);  
		}
		
		System.out.println("Informe a quantidade de locais:");
		int m = s.nextInt();
		Local[] locais = new Local[m];
		
		for (int i = 0; i < m; i++) {
			System.out.println("Largura:");
			double largura = s.nextDouble();
			System.out.println("Comprimento:");
			double comprimento = s.nextDouble();
			System.out.println("É ao ar livre?");
			boolean arLivre = s.nextBoolean();
			locais[i] = new Local (largura, comprimento, arLivre);
		}
		
		//pares de combinações festa/local que podem ser alocados um ao outro
		for (int i = 0; i < festas.length; i++) {
			System.out.println("----------------------------------" + "\né uma possível combinação" + "\n----------------------------------");
			for (int j = 0; j < locais.length; j++) {
				if (festas[i].possivelLocal(locais[j]) && locais[j].possivelFesta(festas[i])) {
					System.out.println(festas[i].mostraFesta() + locais[j].mostraLocal());
				} 
			}
		}
		
		s.close();

	}

}
