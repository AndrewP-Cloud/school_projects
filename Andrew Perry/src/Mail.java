//Group 2
//Kendall Joseph
//Ryan Diaz
//Kunwar Pardeep
//Helen Schuelke
//Andrew Perry

public class Mail {
    public static void main(String[] args) {
        //Integers defined
        double base = 2.00;
        int distance = 1005;
        int weight = 105;

        //Distance and weight cost formulae
        double DCost = (.03*(distance));
        double WCost = (.05*(weight));

        //Total cost formula
        double total = (base+DCost+WCost);

        //Print statements
        System.out.println("Base Price:               "+base);
        System.out.println("Extra cost for distance:  "+DCost);
        System.out.println("Extra cost for weight:    "+WCost);
        System.out.println("----------------------------------");
        System.out.println("Total postage cost:       "+total);
    }
}