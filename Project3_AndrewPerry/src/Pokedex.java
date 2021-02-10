import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;


public class Pokedex{
    Pokemon pokemon_list[] = new Pokemon[1];
    int num_pokemon = 0;
    /*
    * Return all the names of the Pokemon species in the
    * Pokedex
    */
    public Pokedex(int max)
    {
        pokemon_list = new Pokemon[max];
    }

    public String[] listPokemon()
    {
        String pokemon_names[] = new String[num_pokemon];

        for(int b = 0; b < num_pokemon; b++){
            pokemon_names[b] = pokemon_list[b].getSpecies();
        }

        return pokemon_names;
    }
    /*
    * Add a Pokemon to the Pokedex and return true if it can
    * actually be added to the Pokedex. If not, return false.
    */
    public boolean addPokemon(String species) {
            for(int i =0; i<num_pokemon; i++)
            {
                if(species.equalsIgnoreCase(pokemon_list[i].getSpecies())){
                System.out.println("Duplicate");
                return false;
            }
            }
            pokemon_list[num_pokemon] =new Pokemon(species);
            num_pokemon++;
            return true;
        }
    /*
     * Return the stats of a certain Pokemon that you are
    * searching for.
    */
    public int[] checkStats(String species)
    {
        for (int i = 0; i < num_pokemon; i++)
        {
            if (species.equalsIgnoreCase(pokemon_list[i].getSpecies()))
            {
                int stats[] = new int[3];
                stats[0] = pokemon_list[i].getAttack();
                stats[1] = pokemon_list[i].getDefense();
                stats[2] = pokemon_list[i].getSpeed();

                return stats;
            }
        }
        System.out.println("Missing");
        return null;

    }
    public void sortPokedex() {
        Arrays.sort(pokemon_list);
    }
    /*
    * Evolve a certain Pokemon that you are searching for in the
    * Pokedex and return true if the Pokemon is actually in the
    * the Pokedex. If not, return false.
     */
    public boolean evolvePokemon(String species)
    {
        for(int i =0; i<num_pokemon; i++)
        {
            if(species.equalsIgnoreCase(pokemon_list[i].getSpecies())){
            pokemon_list[i].evolve();
                System.out.print(species + " has evolved!");
            return true;
        }
        }
        System.out.println("Missing");
        return false;
    }
}
