public class CheckingAccount extends BankAccount implements Depositable, Withdrawable{
    public CheckingAccount(double balance){
        super(balance);
    }

    @Override
    public void deposit(double amount){
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount){
        setBalance(getBalance() - amount);
    }
}
