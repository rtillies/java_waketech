package bankAccount;

public abstract class Account {
	
	// create a four-digit ID number
	private int id = (int)(Math.random() * 8999) + 1000;
	protected double balance;

	// abstract methods
    public abstract void deposit (double amount);
    public abstract void withdraw (double amount);
    public abstract void reconcileAccount();
    
    // non-abstract methods
    public int getID() 			{ return this.id; }
    public double getBalance()	{ return this.balance; }
    
}