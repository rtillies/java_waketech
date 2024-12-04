

public class Checking2 extends Account {

	public Checking2(int id, double initialDeposit) {
		super(id, initialDeposit);
		// TODO Auto-generated constructor stub
	}

	/* TODO List
	 * - header with author, date, and purpose
	 * - establish inheritance
	 * - private fields
	 * - one constructor
	 * - getter and setter methods
	 * - inherited methods
	 * - toString method
	 * - any helper methods you wish to create
	 */
	
    private static final double MINIMUM_BALANCE = 100.0;

    public Checking(double initialDeposit) {
    	super();
    	this.type = "Checking";
        this.balance = initialDeposit;
    }

    public boolean deposit(double amount) {
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        this.balance -= amount;
        return true;
    }
    
    public boolean check(double amount) {
        if (balance >= amount)
        	return withdraw(amount);
//            this.balance -= amount;
        else {
        	
//        	throw new IllegalArgumentException("Insufficient Funds");
//            System.out.println("Cannot process check");
            return false;
        }
        
        
//        try {
//        	
//        } catch (IllegalArgumentException e) {
//        	System.out.println("Insufficient Funds");
//        }
    }
    
    private boolean applyMinBalanceFee() {
    	if(balance < MINIMUM_BALANCE) {
            withdraw(15);
    		return true;
    	} 
    	return false;
    }
    
    private boolean applyOverdraftFee() {
    	if(balance < 0.0) {
    		withdraw(35);
    		return true;
    	}
    	return false;
    }

	@Override
	public void reconcile() {
    	if(applyOverdraftFee()) {
    		applyMinBalanceFee();
    	}
	}

	@Override
	public String toString() {
		return String.format("%s %4d | Balance: $%,10.2f |", this.getType(), this.getID(), balance);
	}
}