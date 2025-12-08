public class Podcast extends Audio implements Reproduzivel{
	protected String host;
	
	public Podcast(String titulo, double duracao, String host){
		super(titulo, duracao);
		this.host = host;
	}

	public String getHost(){
		return this.host;
	}
	public void setHost(String host){
		this.host = host;
	}
	@Override
	public void reproduzir(){
		System.out.println("Podcast com: "+this.host+" - Episódio sobre "+getTitulo());
	}
}