
public class Principal {

	public static void main(String[] args) {

		Turma poo = new Turma(15);
		
		poo.insere("A", 10, 8.5);
		poo.insere("B", 8, 9.5);
		poo.insere("C", 12, 7.5);
		poo.insere("D", 10, 8.5);
		poo.insere("E", 8, 9.5);
		
		poo.mostra();
	}

}
