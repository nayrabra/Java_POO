
public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		Contato contato1 = new Contato("João", "5676-67367", true);
		Contato contato2 = new Contato("Micardão", "5676-67367", true);
		Contato contato3 = new Contato("ronisson", "5676-67367", false);
		Contato contato4 = new Contato("Raildo", "5676-67367", true);
		
		agenda.adicionarContato(contato1);
		agenda.adicionarContato(contato2);
		agenda.adicionarContato(contato3);
		agenda.adicionarContato(contato4);
		
		System.out.println(agenda.contarLetra("R"));
		System.out.println(agenda.ehFavorito());
		

	}

}
