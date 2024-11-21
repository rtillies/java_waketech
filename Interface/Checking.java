public class Checking implements Account {

    private double balance;

    public Checking(double initialDeposit) {
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            this.balance -= amount;
        else
            System.out.print("Insufficient Funds");
    }

    public double getBalance() {
        return this.balance;
    }
}