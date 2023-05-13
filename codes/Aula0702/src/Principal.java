import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int tam = s.nextInt();			
		
		int[] idades = new int[tam];        
		
		for (int i = 0; i < tam; i++) {     
			idades[i] = s.nextInt();       
		}                           
		
		//MÉDIA
		double soma = 0;
		for (int i = 0; i < idades.length; i++) {
			soma = soma + idades[i];
		}	
		double media = soma/idades.length;
		System.out.println(media);
		
		//MAIOR ELEMENTO DE UM VETOR
		int max = idades[0];
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > max) {
				max = idades[i];
			}
		}
		System.out.println(max);
		
		//MENOR ELEMENTO DE UM VETOR
		int min = idades[0];
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] < min) {
				min = idades[i];
			}
		}
		System.out.println(min);
		
	}

}
