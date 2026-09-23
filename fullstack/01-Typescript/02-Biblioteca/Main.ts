const b1 = Biblioteca.getInstance();
const b2 = Biblioteca.getInstance();
console.log(b1 === b2); // true

b1.adicionar(Livro.criarRomance("Dom Casmurro"));
b1.adicionar(Livro.criarGibi("Turma da Mônica"));
b1.adicionar(Revista.criar("Superinteressante", 450));

const livro = Livro.criarRomance("O Cortiço");
b2.adicionar(livro);
livro.emprestar();

b1.listar();
console.log(Item.totalItens); // 4

// Estes devem dar erro (teste um de cada vez):
// new Item("X");            -> classe abstrata
// new Livro("X", 100);      -> construtor privado
// livro.emprestar();        -> já emprestado
// livro.paginas = -10;      -> setter com validação
// livro.disponivel = true;  -> sem setter