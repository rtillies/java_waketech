public class Savings implements Account {

  private double balance;
  private double interestRate;

  public Savings(double initialDeposit) {
      this.balance = initialDeposit;
      interestRate = 0.045; // 4.5%
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

  public void applyInterest() {
    balance += balance * interestRate / 12;
  }
}