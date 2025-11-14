public class Main{
    public static void main(String[] args) {
        SavingsAccount saveone = new SavingsAccount(200, 0.1);
        SavingsAccount savetwo = new SavingsAccount(300, 0.2);
        KidsAccount kidone = new KidsAccount(170,0.4);

        transfer(savetwo, saveone,50);
        System.out.println(kidone.getBalance());
        System.out.println(saveone.getBalance());
    }
    public static void transfer(Withdrawable from, Depositable to, double amount){
        from.withdraw(amount);
        to.deposit(amount);
    }
}
