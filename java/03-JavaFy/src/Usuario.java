public class Usuario{
	public static void main(String args[]){
		String entradaUsuario = "PREMIUM";
		Plano meuPlano = Plano.valueOf(entradaUsuario);
		System.out.println("Plano selecionado: "+meuPlano);
		Musica msc = new Musica("Billie Jean", 4.5, "Michael Jackson");
		msc.reproduzir();
	}
}