import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int control = 0;
        String input;

        //Start Text
        System.out.println("Welcome to your new PokeDex!");
        System.out.println("How many Pokemon are in your region: ");

        int num_pokemon;
        num_pokemon = scan.nextInt();
        Pokedex poke = new Pokedex(num_pokemon);

        System.out.println("");
        System.out.println("Your new Pokedex can hold " + num_pokemon + " Pokemon. Let's start using it!");
        System.out.println("");
        //

        //Menu
        while (control >= 0) {
            while (control <= 6) {

                System.out.println("1. List Pokemon");
                System.out.println("2. Add Pokemon");
                System.out.println("3. Check a Pokemon's Stats");
                System.out.println("4. Evolve Pokemon");
                System.out.println("5. Sort Pokemon");
                System.out.println("6. Exit");
                System.out.println("");
                System.out.print("What would you like to do?");


                try {
                    control = scan.nextInt();
                    System.out.println("");
                } catch (InputMismatchException x) {
                    control = 0;
                    scan.nextLine();
                }
                if (control == 0) {
                    //invalid input
                    System.out.println("This is not a valid choice. Try again");
                    continue;
                }
                if (control == 1) {
                    //list
                    String names[] = poke.listPokemon();
                    for(int i=0; i < names.length; i++){
                        System.out.print((i + 1) + ". " + names[i]);
                        System.out.println("");
                        control = 0;

                    }
                    System.out.println("");
                }
                if (control == 2) {
                    //add
                    System.out.print("Please enter the Pokemon's Species: ");
                    String in = scan.nextLine();
                    in = scan.nextLine();
                    System.out.println("");

                    poke.addPokemon(in);
                    control = 0;

                }
                if (control == 3) {
                    //stats
                    System.out.print("Please enter the Pokemon of interest: ");
                    input = scan.nextLine();
                    input = scan.nextLine();

                    int stats[] = poke.checkStats(input);

                    if (stats == null) {
                        System.out.println("");
                    }
                    else {
                        System.out.println("");
                        System.out.println("The stats for " + input + " are:");
                        System.out.println("Attack: " + stats[0]);
                        System.out.println("Defense: " + stats[1]);
                        System.out.println("Speed: " + stats[2]);
                        System.out.println("");
                   }
                    control = 0;
                }
                if (control == 4) {
                    //evolve
                    scan.nextLine();
                    System.out.print("Please enter the Pokemon of interest: ");
                    input = scan.nextLine();
                    System.out.print("");

                    poke.evolvePokemon(input);
                    System.out.println("");
                    System.out.println("");
                    control = 0;

                }
                if (control == 5) {
                    //sort
                    poke.sortPokedex();
                    System.out.println("");
                    control = 0;
                }
                if (control == 6) {
                    //exit
                    System.exit(0);
                }
            }

        }
        if(control !=4){
            System.out.println("This is not a valid choice. Try again");
            control = 0;
        }
    }
}