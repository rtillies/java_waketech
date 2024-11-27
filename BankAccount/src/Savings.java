

public class Savings extends Account {

	/* TODO List
	 * - header with author, date, and purpose
	 * - establish inheritance
	 * - private fields
	 * - two constructors
	 * - getter and setter methods
	 * - inherited methods
	 * - toString method
	 * - any helper methods you wish to create
	 */
	
	// private fields
	private double interestRate;

	// constructor with one argument
	public Savings(double initialDeposit) {
		super();
    	this.type = "Savings";
		this.balance = initialDeposit;
		interestRate = 0.02; // 2.0%
	}
	
	// constructor with two arguments
	public Savings(double initialDeposit, double rate) {
		super();
		this.type = "Savings";
		this.balance = initialDeposit;
		interestRate = rate;
	}

    public boolean deposit(double amount) {
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        	return true;
        }
        else {
//        	System.out.print("Insufficient Funds");
        	return false;
        }
    }
    
    public void applyInterest() {
   	  balance += balance * interestRate / 12;  // monthly
    	// balance += balance * interestRate / 52;  // weekly
   	  // balance += balance * interestRate / 360; // daily
    }

	@Override
	public String toString() {
//		return "Savings [balance=" + balance + ", interestRate=" + interestRate + "]";
//		return String.format("%s %4d | Balance: $%,10.2f |", this.getType(), this.getID(), balance);

		return String.format("%8s %4d | Balance: $%,10.2f | Rate: %.1f%%", this.getType(), this.getID(), balance, interestRate * 100);

	}

	@Override
	public void reconcile() {
		// TODO Auto-generated method stub
		applyInterest();
	}

}