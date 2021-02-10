//Andrew Perry
//UFID: 2958-6768

public class CheckingAccount extends BankAccount{
    //attributes
    private double transactionFees;

    public CheckingAccount(String accOwner, double accBalance){
        super(accOwner, accBalance);
        transactionFees = 0;
    }

    public String toString(){
        return super.toString() + "," + transactionFees;
    }

    public double withdraw(double withdraw){
        if(withdraw <= accBalance){
            accBalance = accBalance - withdraw;
            transactionFees = transactionFees + 2;
            return accBalance;
        }
        else{
            return -1;
        }

    }
}
