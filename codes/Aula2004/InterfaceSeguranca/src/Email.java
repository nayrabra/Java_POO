
public class Email implements Seguranca {

	@Override
	public boolean verificaSenha(String senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void mensagemSucesso() {
		System.out.println("Email acessado com sucesso");
		
	}

	@Override
	public void mensagemFracasso() {
		System.out.println("Senha incorreta");
		
	}

}
