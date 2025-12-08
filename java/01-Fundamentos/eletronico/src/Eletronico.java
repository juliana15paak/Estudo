public class Eletronico extends Produto{

	public Eletronico(String nome, double preco){
		super(nome, preco);
	}

	public int calcularPrecoFinal(){
		double resultado = this.preco + (this.preco * Produto.imposto);
		return (int) resultado;
	}
}