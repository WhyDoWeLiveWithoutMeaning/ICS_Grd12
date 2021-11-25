package Unit1.Pokemon;

public class PokemonTest {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", Pokemon.ELECTRIC, 35, 55, 40);
        Pokemon charizard = new Pokemon("Charizard", Pokemon.FIRE, 78, 84, 78);
        System.out.println(pikachu);
        System.out.println(charizard);
    }
}
