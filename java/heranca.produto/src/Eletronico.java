public class Eletronico extends Produto{
	private final int garantia_meses = 12;

	public int calcularPrecoFinal(){
		double resultado = this.preco + (this.preco * Produto.imposto);
		return (int) resultado;
	}
}