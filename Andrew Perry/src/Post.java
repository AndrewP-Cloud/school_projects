public class Post {
    public static void main(String[] args) {
        
        //**Integers defined
        double base = 2.00;
        double distance = 1005;
        double weight = 105;
        String shipping = "Domestic";
        String acceptable = "Yes";

        //**Distance and weight cost formulae
        double distanceCost = .03 * distance;
        double weightCost = .05 * weight;

        //**Total formula
        double total = base + distanceCost + weightCost;
        
        //**Domestic
        if (shipping == "Domestic") {
        }
        
        //**International
            //Weight Tracker
        else {
            shipping = "International";
            if (weight < 100) {
                total = 25;
            }
            if (weight > 100 && weight < 200) {
                base = 30;
                weightCost = 1 * weight;
            }
            if (weight > 200) ;
            acceptable = "No";
        }
        
        //**Print Statements
        System.out.println("Shipping Type:      " + shipping);
        System.out.println(acceptable);

        //**Acceptable Check
        if (acceptable == "Yes") {
            System.out.println("Total postage cost:       $" + total);
        } else {
            System.out.println("Error: Package is not acceptable");
        }
    }
}


