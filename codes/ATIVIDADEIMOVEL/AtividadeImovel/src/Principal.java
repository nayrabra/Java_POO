import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	    Imovel i1 = new Imovel(1, "Nayra", 200, true, 2018, 400000);
	    i1.mostra();
	    
	    System.out.println("-------------------------------");
	    System.out.println("DIGITE AS INFORMAÇÕES DO IMÓVEL");
	    System.out.println("-------------------------------");
		
	    Scanner s = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de imóveis que deseja consultar: ");
		int n = s.nextInt();
		s.nextLine();
		System.out.println("Número de imóveis a ser consultado: " + n);
		
		int tipo[] = new int[n];
		String nome[] = new String[n];
		double tamanho[] = new double[n];
		boolean ehNobre[] = new boolean[n];
		int ano[] = new int[n];
		double valor[] = new double[n];
		
		System.out.println("Informe se é casa (digite 1) ou apartamento (digite 2): ");
		for (int i = 0; i < n; i++) {
			tipo[i] = s.nextInt();
			System.out.println(tipo[i]);
		} 
		
		System.out.println("Informe o(s) nome(s) do(s) proprietário(s): ");
		for (int i = 0; i < n; i++) {
			nome[i] = s.next();
			System.out.println(nome[i]);
		}
		
		System.out.println("Informe o(s) seu(s) respectivo(s) tamanho(s): ");
		for (int i = 0; i < n; i++) {
			tamanho[i] = s.nextDouble();
			System.out.println(tamanho[i]);
		}
		
		System.out.println("Informe se está ou não em área nobre: ");
		for (int i = 0; i < n; i++) {
			ehNobre[i] = s.nextBoolean();
			System.out.println(ehNobre[i]);
		}
		
		System.out.println("Informe o ano da compra: ");
		for (int i = 0; i < n; i++) {
			ano[i] = s.nextInt();
			System.out.println(ano[i]);
		}
		
		System.out.println("Informe o valor em que foi/foram comprado(s): ");
		for (int i = 0; i < n; i++) {
			valor[i] = s.nextDouble();
			System.out.println(valor[i]);
		}
		
		double calculoIPTU;
		System.out.println("Valor a pagar de IPTU: ");
		for (int i = 0; i < valor.length; i++) {
			if (tipo[i] == 2 && tamanho[i] > 100) {
				calculoIPTU = valor[i] * 0.05;
				System.out.println("R$ " + calculoIPTU);
			} else if (tipo[i] == 2 && tamanho[i] <= 100) {
				calculoIPTU = valor[i] * 0.02;
				System.out.println("R$ " + calculoIPTU);
			} else if (tipo[i] == 1 && tamanho[i] > 100) {
				calculoIPTU = valor[i] * 0.03;
				System.out.println("R$ " + calculoIPTU);
			} else {
				calculoIPTU = valor[i] * 0.01;
				System.out.println("R$ " + calculoIPTU);
			}
		}
		
		double valorVenda;
		System.out.println("Possível valor a ser vendido: ");
		for (int i = 0; i < tamanho.length; i++) {
			if (ehNobre[i] && tamanho[i] > 100) {
				valorVenda = valor[i] * 1.8;
				System.out.println("R$ " + valorVenda);
			} else if (ehNobre[i] && tamanho[i] <= 100) {
				valorVenda = valor[i] * 1.1;
				System.out.println("R$ " + valorVenda);
			} else if (!ehNobre[i] && tamanho[i] > 100) {
				valorVenda = valor[i] * 1.2;
				System.out.println("R$ " + valorVenda);
			} else {
				valorVenda = valor[i] * 1.05;
				System.out.println("R$ " + valorVenda);
			}
		}
		
		System.out.println("O(s) nome(s) do(s) proprietário(s) que tem imóvel com mais de 10 anos: ");
		int anoAtual = 2023;
		int tempoExistencia;
		for (int i = 0; i < ano.length; i++) {
			tempoExistencia = anoAtual - ano[i];
		if (tempoExistencia > 10) {
			System.out.println(nome[i]);
		}
		
		}
		
		int countCasa = 0;
		int countApartamento = 0;
		for (int i = 0; i < tipo.length; i++) {
			if (tipo[i] == 1) {
				countCasa++;
			} else if (tipo[i] == 2) {
				countApartamento++;
			}
		}
		System.out.println("Possui " + countCasa + " casa(s) cadastrada(s) e " + countApartamento + " apartamento(s) cadastrado(s)");
		
		double countNobre = 0;
		double countN = 0;
		for (int i = 0; i < tamanho.length; i++) {
			if (ehNobre[i] == true) {
				countNobre += tamanho[i];
				countN++;
			}
		}
		double mediaTamanhoNobre = countNobre/countN;
		System.out.println("Media do tamanho dos apartamentos localizados em area nobre: " + mediaTamanhoNobre + " m²");
	    
		
		double menorIPTUNaoNobre = 0;
		System.out.print("Menor IPTU de uma casa cadastrada em uma area não nobre: R$ ");
		for (int i = 0; i < ehNobre.length; i++) {
			if (ehNobre[i] == false) {
					if (tipo[i] == 2 && tamanho[i] > 100) {
						calculoIPTU = valor[i] * 0.05;
					} else if (tipo[i] == 2 && tamanho[i] <= 100) {
						calculoIPTU = valor[i] * 0.02;
					} else if (tipo[i] == 1 && tamanho[i] > 100) {
						calculoIPTU = valor[i] * 0.03;
					} else {
						calculoIPTU = valor[i] * 0.01;
					} if (calculoIPTU < valor[i]) {
						menorIPTUNaoNobre = calculoIPTU;
					}
				} 
			}
		System.out.println(menorIPTUNaoNobre);

		
		
		double menorValorVenda = 0;
		for (int i = 0; i < tamanho.length; i++) {
			if (ehNobre[i] && tamanho[i] > 100) {
				valorVenda = valor[i] * 1.8;
			} else if (ehNobre[i] && tamanho[i] <= 100) {
				valorVenda = valor[i] * 1.1;
			} else if (!ehNobre[i] && tamanho[i] > 100) {
				valorVenda = valor[i] * 1.2;
			} else {
				valorVenda = valor[i] * 1.05;
			} while (menorValorVenda < valorVenda) {
				menorValorVenda = valorVenda;
			}
		}
		System.out.println("Tamanho do imovel com menor valor de venda: " + menorValorVenda);
		
		s.close();
	
	}
}
