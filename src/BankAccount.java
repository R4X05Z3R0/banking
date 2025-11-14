public abstract class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

//    public void deposit(double amount){
//        setBalance(getBalance() + amount);
//    }

//    public void withdraw(double amount){
//        setBalance(getBalance() - amount);
//    }

    public double getBalance(){
        return balance;
    }

    protected void setBalance(double balance){
        this.balance = balance;
    }
}