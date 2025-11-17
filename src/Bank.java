import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public ArrayList<BankAccount> getInterestBearingAccounts(){
        ArrayList<BankAccount> interestAccounts = new ArrayList<>();
        for(BankAccount account : getAccounts()){
            if (account instanceof InterestBearing){
                interestAccounts.add(account);
            }
        }
        return interestAccounts;
    }

    public void applyInterest() {
        for (BankAccount account : getInterestBearingAccounts()) {
            if (account instanceof InterestBearing) {
                ((InterestBearing) account).applyInterest();
            }
        }
    }
}
