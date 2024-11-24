package bankAccount;

public class Checking extends Account {

    private double balance;
    private static final double MINIMUM_BALANCE = 100.0;

    public Checking(double initialDeposit) {
    	super();
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("Add $%,.2f to ");
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
    
    private boolean applyMinBalanceFee() {
    	if(balance < MINIMUM_BALANCE) {
    		balance -= 15;
    		return true;
    	} 
    	return false;
    }
    
    private boolean applyOverdraftFee() {
    	if(balance < 0.0) {
    		balance -= 35;
    		return true;
    	}
    	return false;
    }

	@Override
	public void reconcileAccount() {
    	if(applyOverdraftFee()) {
    		applyMinBalanceFee();
    	}
	}

	@Override
	public String toString() {
//		String output = "Checking \n";
		return String.format("Checking %4d | Balance: $%,10.2f |", this.getID(), balance);
//		return output;
	}
}