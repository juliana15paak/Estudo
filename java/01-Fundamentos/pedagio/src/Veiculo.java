public class Veiculo{
	protected String modelo;
	protected double tarifaBase;
	protected static double taxaRodovia = 1.50;

	public Veiculo(String modelo, double tarifaBase){
		this.modelo = modelo;
		this.tarifaBase = tarifaBase;
	}
	
	public void exibirDados(){
		System.out.println("Modelo: " + modelo);
   	System.out.println("Tarifa Base: " + tarifaBase);
	}
}
