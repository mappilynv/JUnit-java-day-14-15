import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount stiorra = new BankAccount("Stiorra", 5000, 1001);
    BankAccount alfred = new BankAccount("Alfred", 100000, 1002);
    double deposit = 300.00;
    double withdraw = 200.00;
    @Test
    @DisplayName("Deposit money")
    void getDeposit() {
        assertEquals(300.00, alfred.getDeposit(deposit));
    }

    @Test
    @DisplayName("Withdraw money")
    void getWithdrawal() {
        assertEquals(200.00, stiorra.getWithdrawal(withdraw));
    }

    @Test
    @DisplayName("Check the account balance of transferee")
    void getTransfer() {
        alfred.getTransfer(stiorra, 50000);
        assertEquals(55000, stiorra.getAccountBalance());
    }

    @Test
    @DisplayName("Check the account balance of transferor")
    void getTransfer2() {
        alfred.getTransfer(stiorra, 50000);
        assertEquals(50000, alfred.getAccountBalance());
    }

    @Test
    @DisplayName("Print account balance")
    void printAccount() {
        assertEquals("Stiorra's account balance: 5000.0", stiorra.printAccount());
    }
}