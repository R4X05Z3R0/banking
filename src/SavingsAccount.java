public class SavingsAccount extends BankAccount implements Depositable, Withdrawable, InterestBearing{
    private double interestRate;

    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void applyInterest(){
        setBalance(getBalance() + getBalance() * interestRate);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }
}