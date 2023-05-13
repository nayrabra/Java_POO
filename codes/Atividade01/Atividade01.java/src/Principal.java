import java.util.Scanner;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Informe a quantidade de banda(s) que você deseja inserir: ");
		int n = s.nextInt();
		s.nextLine();

		String nome[] = new String[n];
		String tipo[] = new String[n];
		int integrantes[] = new int[n];
		double lucro[] = new double[n];
		int shows[] = new int[n];

		System.out.println("Informe o(s) nome(s) da(s) banda(s): ");
		for (int i = 0; i < n; i++) {
			nome[i] = s.nextLine();
		}

		System.out.println("Informe o(s) estilo(s) musical(is): ");
		for (int i = 0; i < n; i++) {
			tipo[i] = s.nextLine();
		}

		System.out.println("Informe o número de integrantes de cada banda: ");
		for (int i = 0; i < n; i++) {
			integrantes[i] = s.nextInt();
		}

		System.out.println("Informe o lucro obtido na última turnê de cada banda: ");
		for (int i = 0; i < n; i++) {
			lucro[i] = s.nextDouble();
		}

		System.out.println("Informe a quantidade de shows na última turnê de cada banda: ");
		for (int i = 0; i < n; i++) {
			shows[i] = s.nextInt();
		}
		System.out.println();

		//Perguntas
		System.out.println("Quantidade de bandas que tem cinco integrantes: "); 
		int contador = 0; 
		for(int i = 0; i < integrantes.length; i++) {
			if(integrantes[i] == 5) {
				contador++;
			}
		}
		if (contador < 2) {
			System.out.println(contador + " banda");
		} else {
			System.out.println(contador + " bandas");
		}
		System.out.println();

		int count = 0;
		System.out.println("Quantidade de bandas do tipo Indie: "); 
		for(int i = 0; i < tipo.length; i++) {
			if(tipo[i] == "indie") {
				count++;
			}
		}
		if (count < 2) {
			System.out.println(count + " banda");
		} else {
			System.out.println(count + " bandas");
		}
		System.out.println();

		System.out.println("O maior lucro obtido por uma banda foi de: "); 
		double maiorLucro = lucro[0];
		for(int i = 0; i < lucro.length; i++) {
			if (lucro[i] > maiorLucro) {
				maiorLucro = lucro[i];
			}
		}
		System.out.println("R$" + maiorLucro);
		System.out.println();

		System.out.println("O menor lucro obtido por uma banda foi de: "); 
		double menorLucro = lucro[0];
		for(int i = 0; i < lucro.length; i++) {
			if (lucro[i] < menorLucro) {
				menorLucro = lucro[i];
			}
		}
		System.out.println("R$" + menorLucro);
		System.out.println();

		System.out.println("A banda que tem um único integrante e maior lucro: "); 
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i] == 1 && maiorLucro == lucro[i]) {
				System.out.println(nome[i]);
			} 			
		}
		System.out.println();

		System.out.println("A banda que fez menos shows: "); 
		int menosShows = 0;
		String nomeDaBanda;
		for(int i = 0; i < shows.length; i++) {
			if(shows[i] < menosShows) {
				menosShows = shows[i];
				nomeDaBanda = nome[i];
				System.out.println(nomeDaBanda);
			}
		}
		System.out.println();

		System.out.println("Soma dos integrantes de todas as bandas: "); 
		int soma = 0;
		for (int i = 0; i < integrantes.length; i++) {
			soma += integrantes[i];
		}
		if (soma == 1) {
			System.out.println(soma + " integrante");
		} else {
			System.out.println(soma + " integrantes");
		}
		System.out.println();

		int contador2 = 0;
		System.out.println("Quantidade de bandas que tem mais de um integrante e fez mais que 33 shows: ");
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i] > 1 && shows.length > 33) {
				contador2++;
			}
		}

		if (contador2 < 2) {
			System.out.println(contador2 + " banda");
		} else {
			System.out.println(contador2 + " bandas");
		}
		System.out.println();

		double soma2 = 0;
		System.out.println("Média do lucro total foi de: "); 
		for(int i = 0; i < lucro.length; i++) {
			soma2 += lucro[i];
		}
		double mediaLucro = soma2/lucro.length;
		System.out.println("R$" + mediaLucro);
	}

}
