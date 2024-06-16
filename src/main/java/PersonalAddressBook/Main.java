package BankAccountSystem;

public class Main {
    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setAccountNumber(987654321);
        currentAccount.setOwner("James");
        currentAccount.setBalance(0);
        currentAccount.setOverdraft(100.0);
        currentAccount.deposit(650.0);
        try {
            currentAccount.withdrawal(800.0);
        } catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        } finally {
            currentAccount.displayInfos();
        }


        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setAccountNumber(1234567818);
        savingAccount.setOwner("Haby");
        savingAccount.setBalance(0);
        savingAccount.deposit(1000.0);
        savingAccount.setInterestRate(0.05);
        double balanceInTenYears = savingAccount.calculateInterest(10);
        savingAccount.setBalance(balanceInTenYears);
        savingAccount.displayInfos();
    }
}
