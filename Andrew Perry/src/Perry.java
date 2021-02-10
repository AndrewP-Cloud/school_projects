//Andrew Edward Perry
//Final Project

public class Perry {

    //Number of Days Method
    public static int numberOfDays( int[] days){
    int numDays = days.length;

        return(numDays);
    }
    // List of Sales
    public static int[] totalSale( int[] mac, int[] iphone, int[] ipad, int[] ipod ) {
        int[] totalSales = {0, 0, 0, 0};
        int i = 0;
        if (i == 0) {
            for (int x = 0; x < mac.length; x++) {
                totalSales[i] = totalSales[i] + mac[x];
            }
            i++;
        }
        if (i == 1) {
            for (int x = 0; x < iphone.length; x++) {
                totalSales[i] = totalSales[i] + iphone[x];
            }
            i++;
        }
        if (i == 2) {
            for (int x = 0; x < ipad.length; x++) {
                totalSales[i] = totalSales[i] + ipad[x];
            }
            i++;
        }
        if (i == 3) {
            for (int x = 0; x < ipod.length; x++) {
                totalSales[i] = totalSales[i] + ipod[x];
            }
            i++;
        }
        return(totalSales);
        }



   //Most Popular
    public static int popularProduct( int[] totalSaleValues){
        int popularProduct = 0;
        for(int i = 0; i < totalSaleValues.length; i++) {
            if(totalSaleValues[i] > totalSaleValues[popularProduct]){
                    popularProduct = i;
            }
        }
        return(popularProduct);
    }

    //Day with Highest sales
    public static int popularDay(int days[], int[] mac, int[] iphone, int[] ipad, int[] ipod ){
        int popularDay = 0;
        int currentDay = 0;

        for(int i = 0; i < days.length; i++){
            currentDay = mac[i] + iphone[i] + ipad[i] + ipod[i];
            if(popularDay < currentDay){
                popularDay = i;
            }
        }
        return(popularDay);
    }

    //Main Method
    
    public static void main (String args[]) {

        //Variable initialized
        int numDays = 0;
        int popularProduct = 0;
        int popularDay = 0;

        //Arrays Initialized
        int totalSaleValues[] = {};

        int[] days = {1,2,3};
        int[] mac = {11500,9000,13000};
        int[] iphone = {1100,5000,3400};
        int[] ipad = {900,4300,0};
        int[] ipod = {0,300,120};

        String[] product = {"Mac", "iPhone", "iPad", "iPod"};


        //Methods Called

            //Q1
        numDays = numberOfDays(days);
        System.out.println("Number of Days: " + numDays);

            //Q2
        totalSaleValues = totalSale(mac,iphone,ipad,ipod);
        System.out.println();

            //Q2 Print Array
        System.out.println("Total Sales:");
       for(int i=0; i < totalSaleValues.length; i++ ) {
           System.out.println(product [i] + ": $" + totalSaleValues[i]);
       }
       System.out.println();

            //Q3
        popularProduct = popularProduct(totalSaleValues);
       System.out.println("Most popular product: " + product[popularProduct]);
       System.out.println();

            //Q4
        popularDay = popularDay(days, mac, iphone, ipad, ipod);
        System.out.println("The most popular day of the month was day " + popularDay + ".");
    }
}

