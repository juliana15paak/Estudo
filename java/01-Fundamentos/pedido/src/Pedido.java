public class Pedido{
	StatusPedido status;
	public Pedido(){
		status = StatusPedido.AGUARDANDO;
	}
	public void avancarStatus(){
		if (this.status == StatusPedido.AGUARDANDO){
			this.status = StatusPedido.PREPARANDO;
		} else if (this.status == StatusPedido.PREPARANDO){
			this.status = StatusPedido.ENTREGUE;
		} 
	}
}