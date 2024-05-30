package BankAccountSystem;

public class Account {
    private Integer accountNumber;
    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    protected double balance;

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(Integer deposit) {
        if (deposit > 0) {
            balance += deposit;
            System.out.println("Dépôt de " + deposit + " Euros réussi. Votre nouveau solde est de " + balance + " Euros.");
        } else {
            System.out.println("Le montant de votre dépôt doit être positif.");
        }
    }

    public void withdrawal(Integer withdrawal) {
        if (withdrawal < balance) {
            balance -= withdrawal;
            System.out.println("Retrait de " + withdrawal + " Euros réussi. Votre nouveau solde est de " + balance + " Euros.");
        } else {
            System.out.println("Solde insuffisant. Veuillez entrer un montant inférieur à " + balance + " Euros.");
        }
    }

    public void displayInfos() {
        System.out.println("Numéro de compte : " + getAccountNumber());
        System.out.println("Propriétaire du compte: " + getOwner());
        System.out.println("Solde : " + String.format("%2s", getBalance()) + " Euros");
    }
}
