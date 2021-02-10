//Group 3
// PRESENT Group Members: Bijuri Patel, JC Demont, Madison Marrocco, Andrew Perry

public class MultiplicationTable {
    public static void main(String[] arguments) {
        int number = 0;
        int mult = 1;
        int sqrSize = 9;

        // Loop start
        while (mult < sqrSize+1) {
            number=number+mult;

            //Printer
                // Single digit
            if (number <= 9) {
                System.out.print(" " + number + " ");
            }
                // Double digit
             else {
                System.out.print(number + " ");
             }

            // Square Check
             if (number/sqrSize==mult){
                 // Square Reset
                 number = 0;
                 // Multiplier increase
                 mult++;
                 // Next line
                 System.out.println();
             }
        }
    }
}

