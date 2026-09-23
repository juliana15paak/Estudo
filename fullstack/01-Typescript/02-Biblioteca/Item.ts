export abstract class Item{
  private _disponivel: boolean = true;
  
  abstract readonly tipo: string;
  static totalItens: number = 0;
  
  protected constructor(private _titulo: string){
    Item.totalItens++;
  }
 
  get titulo(): string{
    return this._titulo;
  }
  get disponivel(): boolean{
    return this._disponivel;
  }
  
  abstract calcularPrazoDevolucao(): number;
  
  emprestar(): void{
    if(_disponivel){
      this._disponivel = false;
    } else {
      throw new Error("Item já emprestado");
    }
  }
  devolver(): void{
    this._disponivel = true;
  }
  descrever(): void{
    console.log(`[${this.tipo}] ${this.titulo} - ${this.calcularPrazoDevolucao()} dias de prazo`);
  }
}