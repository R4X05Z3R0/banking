public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }

    void applyInterest(){
        setBalance(getBalance() + getBalance() * interestRate);
    }
}