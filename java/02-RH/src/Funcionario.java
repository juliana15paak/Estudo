public class Funcionario{
	protected String nome;
	protected double salarioBase;
	protected Cargo cargo;
	static final double BONUS_META = 500.0;
	
	public Funcionario(String nome, double salarioBase, Cargo cargo){
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
	}
}