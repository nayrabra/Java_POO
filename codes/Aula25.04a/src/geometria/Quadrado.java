package geometria;

public class Quadrado extends Quadrilatero {

	private double lado;

	public Quadrado(double lado) {
		super(lado, lado, lado, lado);
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		double area = Math.pow(lado, 2);
		return area;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
