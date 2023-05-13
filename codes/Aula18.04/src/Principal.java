import concessionaria.Moto;
import concessionaria.Van;
import concessionaria.Veiculo;

public class Principal {

	public static void main(String[] args) {
		
		int n = 5;
		
		Veiculo[] veiculos = new Veiculo[n];
		veiculos[0] = new Van(false, 2000, 2, 4, 1000);
		veiculos[1] = new Van(true, 3000, 2, 10, 1500);
		veiculos[2] = new Van(true, 4000, 2, 16, 2000);
		veiculos[3] = new Moto(false, 1300, 2, 500);
		veiculos[4] = new Moto(true, 1300, 2, 800);
		
		int maxCilindradas = 0;
		double valorFabMoto = 0;
		int cntVans = 0;
		
		for (int i = 0; i < n; i++) {
			if (veiculos[i] instanceof Moto) {
				Moto m = (Moto)veiculos[i];
				if (m.getCilindradas() > maxCilindradas) {
					maxCilindradas = m.getCilindradas();
					valorFabMoto = m.getValorFabricacao();
				}
			}
			if (veiculos[i] instanceof Van) {
				Van v = (Van)veiculos[i];
				if (v.getnAssentos() > 7) {
					cntVans++;
				}
			}
		}
		
		System.out.println(valorFabMoto);
		System.out.println(cntVans);

	}

}
