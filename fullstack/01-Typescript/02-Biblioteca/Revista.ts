export class Revista extends Item{
  readonly tipo = "Revista";
  private constructor(titulo: string, private _edicao: number){
    super(titulo);
  }
  get edicao(): number{
    return this._edicao;
  }
  calcularPrazoDevolucao(): number{
    return 7;
  }
  
  static criarRevista(titulo: string, edicao: number): Revista{
    return new Revista(titulo, edicao);
  }
}