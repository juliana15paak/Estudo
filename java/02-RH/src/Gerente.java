public class Gerente extends Funcionario implements AcessoRestrito{
	private int senhaDoCofre;

	public Gerente(String nome, double salarioBase, Cargo cargo, int senhaDoCofre){
		super(nome, salarioBase, cargo);
		this.senhaDoCofre = senhaDoCofre;
	}
	
	@Override
	public boolean entrarNoSistema(String senha){
		int senhanum = Integer.parseInt(senha);
		return senhanum == this.senhaDoCofre;
	}
	public double calcularSalarioTotal(){
		return this.salarioBase + Funcionario.BONUS_META;
	}
}