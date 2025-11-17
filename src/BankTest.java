import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @org.junit.jupiter.api.Test
    void getInterestBearingAccounts() {
        //Arrange
        Bank bank = new Bank();
        CheckingAccount norm1 = new CheckingAccount(500);
        CheckingAccount norm2 = new CheckingAccount(276);
        SavingsAccount saveone = new SavingsAccount(200, 0.1);
        SavingsAccount savetwo = new SavingsAccount(300, 0.2);
        KidsAccount kidone = new KidsAccount(170,0.4);

        bank.addAccount(saveone);
        bank.addAccount(savetwo);
        bank.addAccount(kidone);
        bank.addAccount(norm1);
        bank.addAccount(norm2);

        //Act
        ArrayList<BankAccount> interestAccounts = bank.getInterestBearingAccounts();

        //Assert
        ArrayList<BankAccount> testList = new ArrayList<>();
        testList.add(saveone);
        testList.add(savetwo);
        testList.add(kidone);

        assertEquals(testList,interestAccounts);

    }

    @Test
    void testApplyInterest(){
        //Arrange

        Bank bank = new Bank();
        CheckingAccount norm1 = new CheckingAccount(500);
        CheckingAccount norm2 = new CheckingAccount(276);
        SavingsAccount saveone = new SavingsAccount(200, 0.1);
        SavingsAccount savetwo = new SavingsAccount(300, 0.2);
        KidsAccount kidone = new KidsAccount(170,0.4);

        bank.addAccount(saveone);
        bank.addAccount(savetwo);
        bank.addAccount(kidone);
        bank.addAccount(norm1);
        bank.addAccount(norm2);

        //Act
        bank.applyInterest();

        //Assert
        assertEquals(220.0, saveone.getBalance());
        assertEquals(360.0, savetwo.getBalance());
        assertEquals(500, norm1.getBalance());
        assertEquals(276, norm2.getBalance());
        assertEquals(238.0, kidone.getBalance());


    }
}