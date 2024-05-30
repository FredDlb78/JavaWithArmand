package BankAccountSystem;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(1234567818);
        account.setOwner("Fred");
        account.setBalance(0);
        account.deposit(500);
        account.withdrawal(200);
        account.displayInfos();

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setAccountNumber(987654321);
        currentAccount.setOwner("James");
        currentAccount.setBalance(0);
        currentAccount.setOverdraft(100);
        currentAccount.deposit(500);
        currentAccount.withdrawal(600);
        currentAccount.displayInfos();

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setAccountNumber(1234567818);
        savingAccount.setOwner("Haby");
        savingAccount.setBalance(0);
        savingAccount.deposit(1000);
        savingAccount.setInterestRate(5);
        savingAccount.applyInterest(10);
        savingAccount.displayInfos();
    }
}
