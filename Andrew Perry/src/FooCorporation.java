// Group 6
//Andrew Perry, Madison Marrocco, Simon H.

public class FooCorporation {

//Return Functions
        // Employee 1
    public static double employee1() {
        double emp1BasePay = 7.5;
        double emp1HoursWorked = 35;
        double basePay = emp1BasePay;
        double hoursWorked = emp1HoursWorked;
        double salary = 0;

        //Salary Calculation
        if (basePay >= 8) {
            if (hoursWorked <= 40) {
                salary = basePay * hoursWorked;
            }
            if (hoursWorked <= 60) {
                hoursWorked = hoursWorked - 40;
                salary = basePay * 40;
                salary = salary + (1.5 * (basePay * hoursWorked));
                }
            }

    return salary;
    }

        // Employee 2
        public static double employee2() {
            double emp2BasePay = 8.2;
            double emp2HoursWorked = 47;
            double basePay = emp2BasePay;
            double hoursWorked = emp2HoursWorked;
            double salary = 0;

            //Salary Calculation
            if (basePay >= 8) {
                if (hoursWorked <= 40) {
                    salary = basePay * hoursWorked;
                }
                if (hoursWorked <= 60) {
                    hoursWorked = hoursWorked - 40;
                    salary = basePay * 40;
                    salary = salary + (1.5 * (basePay * hoursWorked));
                }
            }

        return salary;
    }

        // Employee 3
        public static double employee3() {
            double emp3BasePay = 10.00;
            double emp3HoursWorked = 73;
            double basePay = emp3BasePay;
            double hoursWorked = emp3HoursWorked;
            double salary = 0;

            //Salary Calculation
            if (basePay >= 8) {
                if (hoursWorked <= 40) {
                    salary = basePay * hoursWorked;
                }
                if (hoursWorked <= 60) {
                    hoursWorked = hoursWorked - 40;
                    salary = basePay * 40;
                    salary = salary + (1.5 * (basePay * hoursWorked));
                }
            }
            return salary;
            }


            //Main Function
    public static void main(String args[]) {

        // Create Counter
        int counter = 1;
        double pay;


        //Printer Start
        if (counter == 1) {
            System.out.println("Employee          Salary");
            System.out.println("---------------------------------------");
        }
        //Employee 1 Print
        while (counter <= 3) {
            System.out.print("Employee " + counter + "        ");
            if(counter == 1) {
                pay = employee1();
                if (pay != 0) {
                    System.out.println("$ " + pay);
                } else {
                    System.out.println("Error");
                }
            }

            if(counter == 2) {
                pay = employee2();
                if (pay != 0) {
                    System.out.println("$ " + pay);
                } else {
                    System.out.println("Error");
                }
            }
            if(counter == 3) {
                pay = employee3();
                if (pay != 0) {
                    System.out.println("$ " + pay);
                } else {
                    System.out.println("Error");
                }
            }
            counter++;
    }
}
}

