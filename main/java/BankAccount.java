public class BankAccount {
    private double accountBalance;
    private String accountHolderName;
    private int accountNumber;


    public BankAccount(String initialName, double initialBalance){
        this.accountHolderName = initialName;
        this.accountBalance = initialBalance;
    }

    public BankAccount(String initialName, double initialBalance, int initialAccountNumber){
        this.accountHolderName = initialName;
        this.accountBalance = initialBalance;
        this.accountNumber = initialAccountNumber;
    }

    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    public void setAccountHolderName(String initialName){
        this.accountHolderName = initialName;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public void setAccountBalance(double initialAccountNumber){
        this.accountBalance = initialAccountNumber;
    }

    public double getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getDeposit(double addDeposit){
        accountBalance += addDeposit;
        return addDeposit;
    }

    public double getWithdrawal(double subtractWithdraw){
        accountBalance -= subtractWithdraw;
        return subtractWithdraw;
    }

    public void getTransfer(BankAccount account, double amount){
        getWithdrawal(amount);
        account.getDeposit(amount);
    }

    public String printAccount(){
        return accountHolderName+"'s account balance: "+accountBalance;
    }


}
