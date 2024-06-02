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
        if (getBalance() - amount > overdraft) {
            setBalance(getBalance() - amount);
            System.out.println("Retrait de " + amount + " € réussi. Votre nouveau solde est de " + balance + " €.");
        } else {
            System.out.println("Solde insuffisant. Veuillez entrer un montant inférieur à " + (balance + overdraft) + " €.");
        }
    }
    @Override
    public void displayInfos() {
        super.displayInfos();
        System.out.println("Découvert autorisé: " + getOverdraft() + " €");
    }
}
