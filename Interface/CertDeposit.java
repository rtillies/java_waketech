public class CertDeposit implements Account {

  private double balance;
  private double interestRate;
  private int months;
  
    public CertDeposit(double deposit, double rate, int months) {
        this.balance = deposit;
        interestRate = rate; // 4.5%
        this.months = months;
  }

  public void deposit(double amount) {
      this.balance += amount;
  }

  public void withdraw(boolean isEarly) {
      if (isEarly)
          this.balance *= 0.9;
      // return this.balance;
  }

  public void withdraw(double amount) {
  }

  public double getBalance() {
      return this.balance;
  }

  public void applyInterest() {
    balance += balance * interestRate / 12 * months;
  }
}