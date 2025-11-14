public class KidsAccount extends BankAccount implements Depositable, InterestBearing{
    double interestRate;

    public KidsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void applyInterest() {
        setBalance(getBalance() + getBalance() * interestRate);
    }
}