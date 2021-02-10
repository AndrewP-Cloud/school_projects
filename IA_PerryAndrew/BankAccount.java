//Andrew Perry
//UFID: 2958-6768

public abstract class BankAccount{
    //attributes
    private String accOwner;
    protected double accBalance;

    public BankAccount(String accOwner, double accBalance){
        this.accOwner = accOwner;
        this.accBalance = accBalance;
    }

    public BankAccount(){
    }

    public String toString(){
        return accOwner + "," + accBalance;
    }

    public double deposit(double deposit){
        accBalance = accBalance + deposit;
        return accBalance;
    }

    public abstract double withdraw(double withdraw);

	
}