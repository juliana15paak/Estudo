public enum Tipo{
	FOGO("Planta", "Água"),
	AGUA("Fogo", "Planta"),
	PLANTA("Água", "Fogo"),
	ELETRICO("Água", "Pedra");

	private final String vantagem;
	private final String desvantagem;
	
	Tipo(String vantagem, String desvantagem){
		this.vantagem = vantagem;
		this.desvantagem = desvantagem;
	}
	
	public String getVantagem(){
		return vantagem;
	}
	public String getDesvantagem(){
		return desvantagem;
	}
}