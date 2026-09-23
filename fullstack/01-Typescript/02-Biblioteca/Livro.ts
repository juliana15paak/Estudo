export class Livro extends Item{
  readonly tipo = "Livro";
  private constructor(titulo: string, private _paginas: number){
    super(titulo);
  }
  
  get paginas(): number{
    return this._paginas;
  }
  set paginas(paginas: number){
    if(paginas > 0){
      this._paginas = paginas;
    } else {
      throw new Error("Número de páginas precisa ser maior que zero");
    }
  }
  calcularPrazoDevolucao(): number{
    return 14;
  }
  static criarRomance(titulo: string): Livro{
    return new Livro(titulo, 300);
  }
  static criarGibi(titulo: string): Livro{
    return new Livro(titulo, 32);
  }
}