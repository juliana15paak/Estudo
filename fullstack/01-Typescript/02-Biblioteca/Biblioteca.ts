export class Biblioteca{
  private static instance: Biblioteca | null = null;
  private itens: Item[] = [];
  private constructor(){}

  static getInstance(): Biblioteca{
    if(Biblioteca.instance === null){
      Biblioteca.instance = new Biblioteca();
    }
    return Biblioteca.instance;
  }
  
  adicionar(item: Item): void{
    this.itens.push(item);
  }
  listar(): void{
    for(const item of this.itens){
      item.descrever();
    }
  }
}