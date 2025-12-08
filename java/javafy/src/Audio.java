public abstract class Audio{
	private String titulo;
	private double duracao;
	static final int TAXA_COMPRESSAO = 128;

	public Audio(String titulo, double duracao){
		this.titulo = titulo;
		this.duracao = duracao;
	}

	public String getTitulo(){
		return this.titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public double getDuracao(){
		return this.duracao;
	}
	public void setDuracao(double duracao){
		this.duracao = duracao;
	}
}