//import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		
//		Imovel [] imov = new Imovel[3];
//		
//		int n = imov.length;
//		for (int i = 0; i < imov.length; i++) {
//			imov[i] = new Imovel();
//			System.out.println();
//		}

		Imovel i1 = new Imovel(1, "Clara", 100, true, 2015, 250000);
		i1.setAnoDaCompra(2018);
		
		i1.mostra();
	
	}

}
