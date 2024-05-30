package BankAccountSystem;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(1234567818);
        account.setBalance(0);
        account.deposit(500);
        account.withdrawal(200);
        account.displayInfos();

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setAccountNumber(987654321);
        currentAccount.setBalance(0);
        currentAccount.setOverdraft(100);
        currentAccount.deposit(500);
        currentAccount.withdrawal(600);
        currentAccount.displayInfos();

        SavingAccount savingAccountaccount = new SavingAccount();
        savingAccountaccount.setAccountNumber(1234567818);
        savingAccountaccount.setBalance(0);
        savingAccountaccount.deposit(1000);
        savingAccountaccount.setInterestRate(5);
        savingAccountaccount.applyInterest(10);
        savingAccountaccount.displayInfos();
    }
}
