
public class Principal {

	public static void main(String[] args) {
		
		Produto[] loja = new Produto[5];
		loja[0] = new Cd("ddfd", 20.0, "45454545", faixas);
		loja[1] = new Dvd("fdfd", 10.0, codigo, duracao);
		loja[2] = new Livro("dfdf", 15.0, "45454545", autor);
		loja[3] = new Cd("dfdf", 17.0, codigo, faixas);
		loja[4] = new Dvd("fgfg", 23.0, codigo, duracao);
		
		for (int i = 0; i < loja.length-1; i++) {
			for (int j = i+1; j < loja.length; j++) {
				if (loja[i].getCodigo().equals(loja[j].getCodigo())) {
					if (loja[i].getClass().equals(loja[j].getClass())) {
						System.out.println("Temos um problema de cadastro!");
					}
				}
			}
		}
		
		
		loja[4].getClass().equals(loja[2].getClass());
	}

}
