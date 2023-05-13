import geometria.Circulo;
import geometria.Geometria;
import geometria.Quadrado;
import geometria.Retangulo;

public class Principal {

	public static void main(String[] args) {		
		Geometria[] formas = new Geometria[3];
		formas[0] = new Circulo(5);
		formas[1] = new Quadrado(2);
		formas[2] = new Retangulo(2, 3);
		
		double baseRetangulo = ((Retangulo)formas[2]).getBase(); //mostrar valor de baseRetangulo
		System.out.println(baseRetangulo);
	}

}
