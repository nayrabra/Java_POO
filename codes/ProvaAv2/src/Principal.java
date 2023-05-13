
public class Principal {

	public static void main(String[] args) {
		
		Acervo[] acervo = new Acervo[5];
		acervo[0] = new LivroDigital("x", "x", 1990, 19);
		acervo[1] = new LivroDigital("x", "x", 1991, 10);
		acervo[2] = new LivroFisico("x", "x", 1994, 20);
		acervo[3] = new LivroFisico("x", "x", 2001, 21);
		acervo[4] = new Trabalho("x", "x");
		
		Biblioteca bib = new Biblioteca(acervo);
		
		((LivroFisico)acervo[2]).emprestar();
		((LivroFisico)acervo[2]).emprestar();
		((LivroFisico)acervo[2]).devolver();
		
		((LivroFisico)acervo[3]).emprestar();
		((LivroFisico)acervo[3]).emprestar();
		((LivroFisico)acervo[3]).devolver();
		
		((Trabalho)acervo[4]).emprestar();
		((Trabalho)acervo[4]).emprestar();
		((Trabalho)acervo[4]).devolver();
		
		int r1 = bib.numTitulosFisicosDisponiveis();
		int r2 = bib.numTrabAlugados();
		int r3 = bib.posPrazoProx();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

	}

}
