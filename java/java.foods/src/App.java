public class App{
	public static void main(String[] args){
		Pizza p1 = new Pizza("Pizza de calabresa", 25.0, Tamanho.GIGANTE);
		Refrigerante r1 = new Refrigerante("Guaraná", 2.0, true);
		
		p1.imprimirEtiqueta();
		r1.imprimirEtiqueta();
		
		System.out.println("Total de produtos no pedido: "+Produto.qtdProdutosCriados);
	}
}