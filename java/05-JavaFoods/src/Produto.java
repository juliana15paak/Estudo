public abstract class Produto{
	protected String nome;
	protected double precoBase;
	protected static int qtdProdutosCriados = 0;
	
	public Produto(String nome, double precoBase){
		this.nome = nome;
		this.precoBase = precoBase;
		Produto.qtdProdutosCriados += 1;
	}
	
	public static int getQtdProdutosCriados(){
		return qtdProdutosCriados;
	}
	
	public abstract double calcularPrecoFinal();
}