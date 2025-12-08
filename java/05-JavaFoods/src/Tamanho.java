public enum Tamanho{
	PEQUENO(0.8),
	MEDIO(1.0),
	GIGANTE(1.5);
	
	public final double fator;
	
	Tamanho(double fator){
		this.fator = fator;	
	}
	
	public double getFator(){
		return fator;
	}
}