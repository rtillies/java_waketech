package bankAccount;

public class Savings extends Account {

	// private double balance;
	private double interestRate;

	public Savings(double initialDeposit) {
		super();
		this.balance = initialDeposit;
		interestRate = 0.02; // 2.0%
	}
	
	public Savings(double initialDeposit, double rate) {
		this.balance = initialDeposit;
		interestRate = rate;
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
    
    public void applyInterest() {
   	  balance += balance * interestRate / 12;  // monthly
    	// balance += balance * interestRate / 52;  // weekly
   	  // balance += balance * interestRate / 360; // daily
    }

	@Override
	public String toString() {
//		return "Savings [balance=" + balance + ", interestRate=" + interestRate + "]";
		return String.format("Savings  %4d | Balance: $%,10.2f | Rate: %.1f%%", this.getID(), balance, interestRate * 100);

	}

	@Override
	public void reconcile() {
		// TODO Auto-generated method stub
		applyInterest();
	}

}