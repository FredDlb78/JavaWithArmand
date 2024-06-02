package BankAccountSystem;

public class Main {
    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setAccountNumber(987654321);
        currentAccount.setOwner("James");
        currentAccount.setBalance(0);
        currentAccount.setOverdraft(100.00);
        currentAccount.deposit(500);
        currentAccount.withdrawal(600.00);
        currentAccount.displayInfos();

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setAccountNumber(1234567818);
        savingAccount.setOwner("Haby");
        savingAccount.setBalance(0);
        savingAccount.deposit(1000);
        savingAccount.setInterestRate(0.05);
        double balanceInTenYears = savingAccount.calculateInterest(10);
        savingAccount.setBalance(balanceInTenYears);
        savingAccount.displayInfos();
    }
}
