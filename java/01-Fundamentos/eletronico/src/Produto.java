public class Produto{
	protected String nome;
	protected double preco;
	protected static double imposto = 0.10;
	
	public Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
} 
