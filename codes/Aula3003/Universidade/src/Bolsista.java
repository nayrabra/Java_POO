
public class Bolsista extends Estudante{
	private double valorBolsa;

	public Bolsista(String matricula, int anoIngresso, String curso, double valorBolsa) {
		super(matricula, anoIngresso, curso);
		this.valorBolsa = valorBolsa;
	}

	public double getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
	
	@Override
	public double gastoComMaterial(int nFolhas) {
		return nFolhas * 0.07;
	}
	
	public int calculaNCopias() {
		int numCopias = (int)(valorBolsa/0.07); //cast(int): fixa que o valor que irá sair deve ser inteiro, pode ser usado no double e float
		return numCopias;
	}
}
