public class Refrigerante extends Produto implements Imprimivel{
	protected boolean gelado;
	
	public Refrigerante(String nome, double precoBase, boolean gelado){
		super(nome, precoBase);
		this.gelado = gelado;
	}
	
	@Override
	public double calcularPrecoFinal(){
		if (gelado){
			return precoBase + 2.0;
		} else {
			return precoBase;
		}
	}
	@Override
	public void imprimirEtiqueta(){
		System.out.println("Refri: "+nome+" - Gelado? " +(gelado ? "Sim" : "Não")+" - R$ "+calcularPrecoFinal());
	}
}