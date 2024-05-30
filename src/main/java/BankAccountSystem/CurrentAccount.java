package BankAccountSystem;

public class CurrentAccount extends Account {
    private Integer overdraft;

    public Integer getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(Integer overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdrawal(Integer withdrawal) {
        if (withdrawal <= balance + overdraft) {
            balance -= withdrawal;
            System.out.println("Retrait de " + withdrawal + " Euros réussi. Votre nouveau solde est de " + balance + " Euros.");
        } else {
            System.out.println("Solde insuffisant. Veuillez entrer un montant inférieur à " + (balance + overdraft) + " Euros.");
        }
    }
    @Override
    public void displayInfos() {
        super.displayInfos();
        System.out.println("Découvert autorisé: " + getOverdraft() + "€");
    }
}
