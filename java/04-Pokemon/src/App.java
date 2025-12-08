public class App {
    public static void main(String[] args) {
        // 1. Criamos o atacante (Charmander - Fogo)
        Pokemon p1 = new Pokemon("Charmander", Tipo.FOGO, 50.0);

        // 2. Criamos o alvo (Bulbasaur - Planta)
        Pokemon p2 = new Pokemon("Bulbasaur", Tipo.PLANTA, 40.0);

        // Passamos o objeto p2 inteiro para dentro do método do p1
        p1.atacar(p2); 
    }
}