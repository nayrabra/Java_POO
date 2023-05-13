package geometria;

public class Circulo implements Geometria {
	
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaPerimetro() {
		return 2 * Math.PI * raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}
