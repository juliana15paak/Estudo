public class Musica extends Audio implements Reproduzivel{
	protected String artista;
	
	public Musica(String titulo, double duracao, String artista){
		super(titulo, duracao);
		this.artista = artista;
	}

	public String getArtista(){
		return this.artista;
	}
	public void setArtista(String artista){
		this.artista = artista;
	}
	
	@Override
	public void reproduzir(){
		System.out.println("Tocando música: "+getTitulo()+" - "+this.artista);
	}
}