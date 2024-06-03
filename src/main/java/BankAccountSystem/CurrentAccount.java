package BankAccountSystem;

public class CurrentAccount extends Account {
    private Double overdraft;

    public Double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(Double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdrawal(Double amount) {
        if (balance + overdraft > amount) {
            balance = balance - amount;
            System.out.println("Retrait de " + amount + " € réussi. Votre nouveau solde est de " + balance + " €.");
        } else throw new InsufficientBalanceException("Your balance is too low for this transaction.");
        }
    @Override
    public void displayInfos() {
        super.displayInfos();
        System.out.println("Découvert autorisé: " + getOverdraft() + " €");
    }
}
