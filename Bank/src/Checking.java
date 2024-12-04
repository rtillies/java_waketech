
public class Checking extends Account {

	private final double MINIMUM_BALANCE = 100.0;
//	private static final double MINIMUM_BALANCE = 100.0;
	
	public Checking(int id, double initialDeposit) {
		super(id);
		this.setType("Checking");
		this.setBalance(initialDeposit);
	}
	
//    public boolean check(double amount) {
////        if (getBalance() >= amount) {
//        	return withdraw(amount);
////        }
////        return false;
//    }
        
	@Override
	public void reconcile() {
		if (getBalance() < MINIMUM_BALANCE) {
			withdraw(10);
		}
	}

	public double getMinimumBalance() {
		return MINIMUM_BALANCE;
	}
	
	

}
