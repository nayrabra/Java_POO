
public class Principal {

	public static void main(String[] args) {
		
		Carro c = new Carro(2010, true, "Preto", "08767545900", "FTG456KH", "Onix");
		
		Carro d = new Carro(2020, true, "Branco", "99967545900", "Hilux");
		d.setAno(2022);
		d.setLicenciado(false);
		int carroDeAno = d.getAno();
		String carroDeNome = d.getNome();
		String cor = d.getCor();
		System.out.println();
		
		int anoDoCarro = c.getAno();
		String nomeDoCarro = c.getNome();
		
		c.setCor("branco");
		String corDoCarro = c.getCor(); 
		
		System.out.println(nomeDoCarro + " de " + anoDoCarro + " de cor " + corDoCarro);
	}

}
