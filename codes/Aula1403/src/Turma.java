
public class Turma {
	
	private String[] nomes;
	private int[] idades;
	private double[] medias;
	private int pos;
	private int tam;
	
	public Turma(int n) {
		nomes = new String[n];
		idades = new int[n];
		medias = new double[n];
		pos = 0;
		tam = n;
	}
	
	public void insere(String nome, int idade, double media) {
		if (pos < tam) {
			nomes[pos] = nome;
			idades[pos] = idade;
			medias[pos] = media;
			pos++;
		} else {
			System.out.println("Turma cheia!!");
		}
	}
	
	public void remove(int index) {
		if (index < pos) {
			pos--;
			nomes[index] = nomes[pos];
			idades[index] = idades[pos];
			medias[index] = medias[pos];
			nomes[pos] = null;
			idades[pos] = 0;
			medias[pos] = 0.0;
		}
	}
	
	public void mostra() {
		for (int i = 0; i < pos; i++) {
			System.out.println("Aluno: " + nomes[i] + " de idade " + 
							   idades[i] + " com média " + medias[i]);
		}
	}
}
