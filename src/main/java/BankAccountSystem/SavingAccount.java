package BankAccountSystem;

public class SavingAccount extends Account implements InterestBearing{
    private double interestRate; // Utilisation de double pour plus de précision

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public Double calculateInterest(int years) {
        return getBalance() * Math.pow((1 + interestRate), years);
    }

    @Override
    public void displayInfos() {
        super.displayInfos();
        System.out.println("Taux d'intérêt : " + interestRate + "%");
    }
}
