package BankAccountSystem;

public class SavingAccount extends Account {
    private double interestRate; // Utilisation de double pour plus de précision

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest(int numberOfYears) {
        if (numberOfYears > 0) {
            for (int i = 0; i < numberOfYears; i++) {
                balance += balance * (interestRate / 100);
            }
            System.out.println("Après " + numberOfYears + " ans avec un taux d'intérêt de " + interestRate + "%, le solde est de " + String.format("%.2f", getBalance()) + " Euros.");
        } else {
            System.out.println("Le nombre d'années doit être positif.");
        }
    }

    @Override
    public void displayInfos() {
        super.displayInfos();
        System.out.println("Taux d'intérêt : " + getInterestRate() + "%");
    }
}
