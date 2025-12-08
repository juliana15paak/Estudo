public class Pizza extends Produto implements Imprimivel{
	protected Tamanho tamanho;
	
	public Pizza(String nome, double precoBase, Tamanho tamanho ){
		super(nome, precoBase);
		this.tamanho = tamanho;
	}
	
	@Override
	public double calcularPrecoFinal(){
		return precoBase * tamanho.getFator();
	}
	@Override
	public void imprimirEtiqueta(){
		System.out.println("Pizza: "+ nome +" - Tamanho: "+ tamanho +" - R$ "+calcularPrecoFinal());
	}
}