import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public ArrayList getInterestBearingAccounts(){
        ArrayList interestAccounts = new ArrayList<>();
        for(BankAccount account : accounts){
            if (account instanceof InterestBearing){
                interestAccounts.add(account);
            }
        }
        return interestAccounts;
    }
}
