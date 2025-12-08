public class Cofre implements Seguranca{
	private int senhaNumerica;
	
	public Cofre(int senhaNumerica){
		this.senhaNumerica = senhaNumerica;
	}
	
	@Override
	public boolean validarSenha(String senha){
		int senhanum = Integer.parseInt(senha);
		if (this.senhaNumerica == senhanum){
			return true;
		} else {
			return false;
		}
	}
}