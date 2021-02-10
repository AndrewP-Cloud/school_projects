//Andrew Perry
//UFID: 2958-6768

public class SavingsAccount extends BankAccount{
    //attributes
    private double minBalance;
    private static double initialInterest = 2.5;

    public SavingsAccount(String accOwner, double accBalance, double minBalance){
        super(accOwner, accBalance);
        this.minBalance = minBalance;
    }

    public String toString(){
        return super.toString() + "," + minBalance + "," + initialInterest;
    }

    public double withdraw(double withdraw){
        if(withdraw <= accBalance - minBalance){
            accBalance = accBalance - withdraw;
            return accBalance;
        }
        else{
            return -1;
        }
    }

    public void applyInterest(){
        accBalance = accBalance + (accBalance * (initialInterest/100));
    }

}