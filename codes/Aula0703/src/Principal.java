
public class Principal {

	public static void main(String[] args) {
		
		Data d1 = new Data(21, 9, 1989);
		Data d2 = new Data(20, 9, 1989);
		
		if (d1.ehIgual(d2)) {
			System.out.println("Data são iguais.");
		} else if (d1.vemAntesI(d2)) {
			System.out.println("A primeira data antecede a segunda.");
		} else {
			System.out.println("A segunda data antecede a primeira.");
		}
	}

}
