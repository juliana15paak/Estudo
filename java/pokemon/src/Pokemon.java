public class Pokemon{
	protected String nome;
	protected Tipo tipo;
	protected double poderAtaque;
	
	public Pokemon(String nome, Tipo tipo, double poderAtaque){
		this.nome = nome;
		this.tipo = tipo;
		this.poderAtaque = poderAtaque;
	}
	
	public double atacar(Pokemon inimigo){
		if (inimigo.tipo.name().equalsIgnoreCase(this.tipo.getVantagem())){
			return poderAtaque*2;
		} else if (inimigo.tipo.name().equalsIgnoreCase(this.tipo.getDesvantagem())){
			return poderAtaque/2;
		} else {
			return poderAtaque;
		}
	}
}