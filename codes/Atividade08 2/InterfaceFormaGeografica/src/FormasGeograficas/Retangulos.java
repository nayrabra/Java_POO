package FormasGeograficas;


public class Retangulos extends Quadrilateros {
	
	private double base;
	private double altura;
	
	public Retangulos(double base, double altura) {
		super(base, altura, base, altura);
		this.base = base;
		this.altura = altura;
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

	@Override
	public double calculaArea() {
		return base * altura;
	}
	
}
