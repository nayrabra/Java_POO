
public class Biblioteca {
	
	private Acervo[] acervo;
	
	public Biblioteca(Acervo[] acervo) {
		this.acervo = acervo;
	}
	
	public int numTitulosFisicosDisponiveis() {
		int cnt = 0;
		for (int i = 0; i < acervo.length; i++) {
			if (acervo[i] instanceof LivroFisico) {
				LivroFisico lf = (LivroFisico)acervo[i];
				cnt += lf.getQntDisponivel();
			}
			if (acervo[i] instanceof Trabalho) {
				Trabalho t = (Trabalho)acervo[i];
				cnt += t.getQntDisponivel();
			}
		}
		return cnt;
	}
	
	public int numTrabAlugados() {
		int cnt = 0;
		for (int i = 0; i < acervo.length; i++) {
			if (acervo[i] instanceof Trabalho) {
				Trabalho t = (Trabalho)acervo[i];
				if (t.getQntDisponivel() == 0) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public int posPrazoProx() {
		int pos = -1;
		int menorPrazo = Integer.MAX_VALUE;
		for (int i = 0; i < acervo.length; i++) {
			if (acervo[i] instanceof LivroDigital) {
				LivroDigital ld = (LivroDigital)acervo[i];
				if (ld.getPrazo() < menorPrazo) {
					pos = i;
					menorPrazo = ld.getPrazo();
				}
			}
		}
		return pos;
	}

	public Acervo[] getAcervo() {
		return acervo;
	}

	public void setAcervo(Acervo[] acervo) {
		this.acervo = acervo;
	}
	
}
