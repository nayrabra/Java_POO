
public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public boolean vemAntesI(Data d) {
		if (ano < d.ano) {
			return true;
		} else if (ano == d.ano && mes < d.mes) {
			return true;
		} else if (ano == d.ano && mes == d.mes && dia <= d.dia) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean vemAntesII(Data d) {
		if (ano > d.ano) {
			return false;
		} else if (mes > d.mes) {
			return false;
		} else if (dia > d.dia) {
			return false;
		} else {
			return true;
		}
	}
	
	public String imprimeData() {
		String data = dia + "/" + mes + "/" + ano;
		return data;
	}
	
	public boolean ehIgual(Data d) {
		return dia == d.dia && mes == d.mes && ano == d.ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
