package BankAccountSystem;

public abstract class Account {
    private Integer accountNumber;
    private String owner;
    protected double balance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

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
            System.out.println("Dépôt de " + deposit + " € réussi. Votre nouveau solde est de " + balance + " €.");
        } else {
            System.out.println("Le montant de votre dépôt doit être positif.");
        }
    }

    public void withdrawal(Double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("Retrait de " + amount + " € réussi. Votre nouveau solde est de " + balance + " €.");
        } else {
            System.out.println("Solde insuffisant. Veuillez entrer un montant inférieur à " + balance + " €.");
        }
    }

    public void displayInfos() {
        System.out.println("Numéro de compte : " + getAccountNumber());
        System.out.println("Propriétaire du compte: " + getOwner());
        System.out.println("Solde : " + String.format("%2s", getBalance()) + " €");
    }
}
