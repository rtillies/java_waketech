
public class Savings extends Account {
	
	private double interestRate;

	public Savings(int id, double initialDeposit) {
		super(id);
		this.setBalance(initialDeposit);
    	this.setType("Savings");
		this.interestRate = 0.02; // 2.0%
	}

	public Savings(int id, double initialDeposit, double interestRate) {
		super(id);
		this.setType("Savings");
		this.setBalance(initialDeposit);
		this.interestRate = interestRate;
	}
	
    public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void reconcile() {
		applyInterest();
	}

	public void applyInterest() {
    	double interest = getBalance() * interestRate / 12;  // monthly
    	this.deposit(interest);
      }

	@Override
	public String toString() {
		return String.format("%s | Rate: %.1f%%", 
				super.toString(), interestRate * 100);
	}
}
