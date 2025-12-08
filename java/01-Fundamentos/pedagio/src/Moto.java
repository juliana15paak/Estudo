public class Moto extends Veiculo{
	private final int fatorDesconto = 2;
	
	public Moto(String modelo, double tarifaBase){
		super(modelo, tarifaBase);
	}

	public int calcularPedagio(){
		double resultado = (tarifaBase + taxaRodovia) / fatorDesconto;
		return (int) resultado;	
	}
	@Override
	public void exibirDados(){
		super.exibirDados();
		System.out.println("Fator Desconto: " + fatorDesconto);
	}
}