package FormasGeograficas;

//como na classe Circulo o perimetro será calculado diferente das demais, não é possível herdar da classe Quadrilatero
public class Circulo implements FormaGeografica{
	
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaPerimetro() {
		double perimetroCirculo = 2 * Math.PI * raio;
		return perimetroCirculo;
	}

	@Override
	public double calculaArea() {
		double areaCirculo = Math.PI * raio * raio;
		return areaCirculo;
	}
	
}
