
public class Principal {

	public static void main(String[] args) {
		
		Pessoa[] vet = new Pessoa[5];
		vet[0] = new Aluno(20, 2); //menos livros
		vet[1] = new Funcionario(33, 5000.00);
		vet[2] = new Aluno(21, 5);
		vet[3] = new Funcionario(21, 1500.00);
		vet[4] = new Aluno(21, 6); //mais livros
		
		int posicaoMaior = 0; //pode ser qqer valor inicial
		int maisLivrosAlugados = 0;
		int posicaoMenor = 0;
		int menosLivrosAluguados = 10000;
		
		for(int i = 0; i < vet.length; i++) {
			if (vet[i] instanceof Aluno) { //primeiro usa o instanceof
				Aluno a = (Aluno)vet[i]; //depois o cast
				if (a.getLivrosAlugados() > maisLivrosAlugados) {
					maisLivrosAlugados = a.getLivrosAlugados();
					posicaoMaior = i;
				}
				if (a.getLivrosAlugados() < menosLivrosAluguados) {
					menosLivrosAluguados = a.getLivrosAlugados();
					posicaoMenor = i;
				}
			}
		}
		
		System.out.println(maisLivrosAlugados);
		System.out.println(posicaoMaior);
		System.out.println(menosLivrosAluguados);
		System.out.println(posicaoMenor);
		
	}

}
