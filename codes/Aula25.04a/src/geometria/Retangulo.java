package geometria;

public class Retangulo extends Quadrilatero {
	
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		super(base, altura, base, altura);
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calculaArea() {
		return base * altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
