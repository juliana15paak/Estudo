export class Empresa{
  public readonly nome: string;
  private readonly colaboradores: Colaborador[] = [];

  constructor(nome: string){
    this.nome = nome;
  }

  adicionarColaborador(colaborador: Colaborador): void{
    this.colaboradores.push(colaborador);
  }
  mostrarColaboradores(): void{
    for(const colaborador of this.colaboradores){
      console.log(colaborador);
    }
  }
}

export class Colaborador{
  constructor(
    public readonly nome: string,
    public readonly sobrenome: string,
  ){}
  
}

const empresa1 = new Empresa('Udemy');
console.log(empresa1.nome);