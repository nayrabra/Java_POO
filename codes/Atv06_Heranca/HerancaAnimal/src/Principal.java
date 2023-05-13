
public class Principal {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro("Bily", 2020, true, true);
		cachorro1.mostraAtributos();
		cachorro1.emiteSom();
		
		int anoAtual = 2023;
		System.out.println("Idade: " + cachorro1.mostrarIdade(anoAtual) + " anos");
		
		Preguica preguica1 = new Preguica("Belinha", 2000, false, true);
		preguica1.mostraAtributos();
		preguica1.emiteSom();
		System.out.println("Idade: " +  preguica1.mostrarIdade(anoAtual) + " anos");

	}

}
